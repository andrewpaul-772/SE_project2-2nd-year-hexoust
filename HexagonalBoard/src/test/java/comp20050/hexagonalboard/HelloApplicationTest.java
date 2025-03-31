package comp20050.hexagonalboard;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;

import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javafx.scene.input.MouseEvent;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    //for now the color changes on every turn as capturing moves haven't been done yet
    @Test
    void testTurn() {
        HelloController controller = new HelloController();
        String hexID  = "hex12";
        Paint current  = controller.getTurn(RED, hexID);
        assertEquals(BLUE, current);
    }

    //test getting the coordinates from the id
    @Test
    void testFindCoords(){
        HelloController controller = new HelloController();
        int[] coords = controller.findCoords(12);
        int[] answer  = {3,-5,2};
        assertEquals(Arrays.toString(answer), Arrays.toString(coords));
    }
}