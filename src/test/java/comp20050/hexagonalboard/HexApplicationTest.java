package comp20050.hexagonalboard;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.DODGERBLUE;

import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HexApplicationTest {

    HexController controller = new HexController();

    @BeforeEach
    void setUp() {
        controller = new HexController();
        controller.hexList = new ArrayList<>();

        // Initialize hexList with 127 empty hexagons (DODGERBLUE)
        for (int i = 0; i < 127; i++) {
            Polygon hex = new Polygon();
            hex.setId("hex" + (i+1));
            hex.setFill(DODGERBLUE);
            controller.hexList.add(hex);
        }
    }

    @Test
    void testFindCoords(){
        int[] coords = controller.findCoords(12);
        int[] answer  = {3,-5,2};
        assertEquals(Arrays.toString(answer), Arrays.toString(coords));
    }

    @Test
    void testFindId_InvalidCoordinates() {
        int[] coords = {100, 100, 100}; // Doesn't exist
        int id = controller.findId(coords);
        assertEquals(0, id); // Should return 0 for not found
    }

    @Test
    void testGetTurn_RedToBlue() {
        Paint result = controller.getTurn(RED, "hex1");
        assertEquals(BLUE, result);
    }

    @Test
    void testGetTurn_BlueToRed() {
        Paint result = controller.getTurn(BLUE, "hex1");
        assertEquals(RED, result);
    }

    @Test
    void testIsNCM_EmptyBoard() {
        int[] coords = controller.findCoords(1); // Any coordinate
        assertTrue(controller.isNCM(coords, RED)); // Should be valid on empty board
    }

    @Test
    void testIsNCM_AdjacentSameColor() {
        // Set hex2 (adjacent to hex1) to RED
        controller.hexList.get(1).setFill(RED);
        int[] coords = controller.findCoords(1);
        assertFalse(controller.isNCM(coords, RED));
    }

    @Test
    void testIsCM_NoCapturePossible() {
        int[] coords = controller.findCoords(1);
        assertFalse(controller.isCM(coords, RED));
    }

    @Test
    void testScan_UpdatesCurrentAlliesAndEnemies() {
        // Set up a scenario where we have allies and enemies
        controller.hexList.get(1).setFill(RED);  // hex2
        controller.hexList.get(2).setFill(RED);  // hex3
        controller.hexList.get(3).setFill(BLUE); // hex4

        int[] coords = controller.findCoords(1); // hex1 coordinates
        controller.currentAllies = new ArrayList<>();
        controller.currentEnemies = new ArrayList<>();

        controller.scan(coords, RED);

        // Check that scan identified our allies and enemies
        assertEquals(2, controller.currentAllies.size());
        assertEquals(1, controller.currentEnemies.size());
    }

    @Test
    void testFriendSize_AvoidsDuplicates() {
        // Set up test data
        int[] coords1 = {0, 0, 0}; // Center hex coordinates
        int[] coords2 = {1, -1, 0}; // Adjacent hex coordinates

        controller.currentAllies = new ArrayList<>();
        controller.currentAllies.add(coords2); // Already visited

        // Call friendSize with a coordinate that has an already-visited neighbor
        controller.friendSize(coords1, RED);

        // Should still have just one element (no duplicates added)
        assertEquals(2, controller.currentAllies.size());
    }

    @Test
    void testEnemySize_CalculatesCorrectly() {
        // Setup a cluster of enemy pieces
        int centerIdx = controller.findId(new int[]{0, 0, 0});
        int neighborIdx1 = controller.findId(new int[]{1, -1, 0});
        int neighborIdx2 = controller.findId(new int[]{-1, 1, 0});

        controller.hexList.get(centerIdx).setFill(BLUE);
        controller.hexList.get(neighborIdx1).setFill(BLUE);
        controller.hexList.get(neighborIdx2).setFill(BLUE);

        controller.currentEnemies = new ArrayList<>();
        controller.tempSize = 0;
        controller.maxEnemy = 0;

        controller.enemySize(new int[]{0, 0, 0}, RED);

        assertEquals(3, controller.maxEnemy);
        assertEquals(3, controller.currentEnemies.size());
    }

}