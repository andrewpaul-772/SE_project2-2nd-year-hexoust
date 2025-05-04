package comp20050.hexagonalboard;
 
 import java.net.URL;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.ResourceBundle;
 import javafx.fxml.FXML;
 import javafx.scene.control.Label;
 import javafx.scene.input.MouseEvent;
 import javafx.scene.paint.Paint;
 import javafx.scene.shape.Circle;
 import javafx.scene.shape.Polygon;
 
 import static javafx.scene.paint.Color.BLUE;
 import static javafx.scene.paint.Color.DODGERBLUE;
 import static javafx.scene.paint.Color.RED;
 
 public class HexController {
 
     @FXML
     private ResourceBundle resources;
 
     @FXML
     private URL location;
 
     @FXML
     private Circle circ01;
 
     @FXML
     private Polygon hex1;
 
     @FXML
     private Polygon hex10;
 
     @FXML
     private Polygon hex100;
 
     @FXML
     private Polygon hex101;
 
     @FXML
     private Polygon hex102;
 
     @FXML
     private Polygon hex103;
 
     @FXML
     private Polygon hex104;
 
     @FXML
     private Polygon hex105;
 
     @FXML
     private Polygon hex106;
 
     @FXML
     private Polygon hex107;
 
     @FXML
     private Polygon hex108;
 
     @FXML
     private Polygon hex109;
 
     @FXML
     private Polygon hex11;
 
     @FXML
     private Polygon hex110;
 
     @FXML
     private Polygon hex111;
 
     @FXML
     private Polygon hex112;
 
     @FXML
     private Polygon hex113;
 
     @FXML
     private Polygon hex114;
 
     @FXML
     private Polygon hex115;
 
     @FXML
     private Polygon hex116;
 
     @FXML
     private Polygon hex117;
 
     @FXML
     private Polygon hex118;
 
     @FXML
     private Polygon hex119;
 
     @FXML
     private Polygon hex12;
 
     @FXML
     private Polygon hex120;
 
     @FXML
     private Polygon hex121;
 
     @FXML
     private Polygon hex122;
 
     @FXML
     private Polygon hex123;
 
     @FXML
     private Polygon hex124;
 
     @FXML
     private Polygon hex125;
 
     @FXML
     private Polygon hex126;
 
     @FXML
     private Polygon hex127;
 
     @FXML
     private Polygon hex13;
 
     @FXML
     private Polygon hex14;
 
     @FXML
     private Polygon hex15;
 
     @FXML
     private Polygon hex16;
 
     @FXML
     private Polygon hex17;
 
     @FXML
     private Polygon hex18;
 
     @FXML
     private Polygon hex19;
 
     @FXML
     private Polygon hex2;
 
     @FXML
     private Polygon hex20;
 
     @FXML
     private Polygon hex21;
 
     @FXML
     private Polygon hex22;
 
     @FXML
     private Polygon hex23;
 
     @FXML
     private Polygon hex24;
 
     @FXML
     private Polygon hex25;
 
     @FXML
     private Polygon hex26;
 
     @FXML
     private Polygon hex27;
 
     @FXML
     private Polygon hex28;
 
     @FXML
     private Polygon hex29;
 
     @FXML
     private Polygon hex3;
 
     @FXML
     private Polygon hex30;
 
     @FXML
     private Polygon hex31;
 
     @FXML
     private Polygon hex32;
 
     @FXML
     private Polygon hex33;
 
     @FXML
     private Polygon hex34;
 
     @FXML
     private Polygon hex35;
 
     @FXML
     private Polygon hex36;
 
     @FXML
     private Polygon hex37;
 
     @FXML
     private Polygon hex38;
 
     @FXML
     private Polygon hex39;
 
     @FXML
     private Polygon hex4;
 
     @FXML
     private Polygon hex40;
 
     @FXML
     private Polygon hex41;
 
     @FXML
     private Polygon hex42;
 
     @FXML
     private Polygon hex43;
 
     @FXML
     private Polygon hex44;
 
     @FXML
     private Polygon hex45;
 
     @FXML
     private Polygon hex46;
 
     @FXML
     private Polygon hex47;
 
     @FXML
     private Polygon hex48;
 
     @FXML
     private Polygon hex49;
 
     @FXML
     private Polygon hex5;
 
     @FXML
     private Polygon hex50;
 
     @FXML
     private Polygon hex51;
 
     @FXML
     private Polygon hex52;
 
     @FXML
     private Polygon hex53;
 
     @FXML
     private Polygon hex54;
 
     @FXML
     private Polygon hex55;
 
     @FXML
     private Polygon hex56;
 
     @FXML
     private Polygon hex57;
 
     @FXML
     private Polygon hex58;
 
     @FXML
     private Polygon hex59;
 
     @FXML
     private Polygon hex6;
 
     @FXML
     private Polygon hex60;
 
     @FXML
     private Polygon hex61;
 
     @FXML
     private Polygon hex62;
 
     @FXML
     private Polygon hex63;
 
     @FXML
     private Polygon hex64;
 
     @FXML
     private Polygon hex65;
 
     @FXML
     private Polygon hex66;
 
     @FXML
     private Polygon hex67;
 
     @FXML
     private Polygon hex68;
 
     @FXML
     private Polygon hex69;
 
     @FXML
     private Polygon hex7;
 
     @FXML
     private Polygon hex70;
 
     @FXML
     private Polygon hex71;
 
     @FXML
     private Polygon hex72;
 
     @FXML
     private Polygon hex73;
 
     @FXML
     private Polygon hex74;
 
     @FXML
     private Polygon hex75;
 
     @FXML
     private Polygon hex76;
 
     @FXML
     private Polygon hex77;
 
     @FXML
     private Polygon hex78;
 
     @FXML
     private Polygon hex79;
 
     @FXML
     private Polygon hex8;
 
     @FXML
     private Polygon hex80;
 
     @FXML
     private Polygon hex81;
 
     @FXML
     private Polygon hex82;
 
     @FXML
     private Polygon hex83;
 
     @FXML
     private Polygon hex84;
 
     @FXML
     private Polygon hex85;
 
     @FXML
     private Polygon hex86;
 
     @FXML
     private Polygon hex87;
 
     @FXML
     private Polygon hex88;
 
     @FXML
     private Polygon hex89;
 
     @FXML
     private Polygon hex9;
 
     @FXML
     private Polygon hex90;
 
     @FXML
     private Polygon hex91;
 
     @FXML
     private Polygon hex92;
 
     @FXML
     private Polygon hex93;
 
     @FXML
     private Polygon hex94;
 
     @FXML
     private Polygon hex95;
 
     @FXML
     private Polygon hex96;
 
     @FXML
     private Polygon hex97;
 
     @FXML
     private Polygon hex98;
 
     @FXML
     private Polygon hex99;
 
     @FXML
     private Label invalidMoveText;
 
 
 
     // Array of coordinates for each hexagon in the board
     private static final int[][] coords = {{0,-6,6},{1,-6,5},{2,-6,4},{3,-6,3},{4,-6,2},{5,-6,1},{6,-6,0},{-1,-5,6},{0,-5,5},{1,-5,4},
             {2,-5,3},{3,-5,2},{4,-5,1},{5,-5,0},{6,-5,-1},{-2,-4,6},{-1,-4,5},{0,-4,4},{1,-4,3},{2,-4,2},
             {3,-4,1},{4,-4,0},{5,-4,-1},{6,-4,-2},{-3,-3,6},{-2,-3,5},{-1,-3,4},{0,-3,3},{1,-3,2},{2,-3,1},
             {3,-3,0},{4,-3,-1},{5,-3,-2},{6,-3,-3},{-4,-2,6},{-3,-2,5},{-2,-2,4},{-1,-2,3},{0,-2,2},{1,-2,1},
             {2,-2,0},{3,-2,-1},{4,-2,-2},{5,-2,-3},{6,-2,-4},{-5,-1,6},{-4,-1,5},{-3,-1,4},{-2,-1,3},{-1,-1,2},
             {0,-1,1},{1,-1,0},{2,-1,-1},{3,-1,-2},{4,-1,-3},{5,-1,-4},{6,-1,-5},{-6,0,6},{-5,0,5},{-4,0,4},
             {-3,0,3},{-2,0,2},{-1,0,1},{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{4,0,-4},{5,0,-5},{6,0,-6},
             {-6,1,5},{-5,1,4},{-4,1,3},{-3,1,2},{-2,1,1},{-1,1,0},{0,1,-1},{1,1,-2},{2,1,-3},{3,1,-4},
             {4,1,-5},{5,1,-6},{-6,2,4},{-5,2,3},{-4,2,2},{-3,2,1},{-2,2,0},{-1,2,-1},{0,2,-2},{1,2,-3},
             {2,2,-4},{3,2,-5},{4,2,-6},{-6,3,3},{-5,3,2},{-4,3,1},{-3,3,0},{-2,3,-1},{-1,3,-2},{0,3,-3},
             {1,3,-4},{2,3,-5},{3,3,-6},{-6,4,2},{-5,4,1},{-4,4,0},{-3,4,-1},{-2,4,-2},{-1,4,-3},{0,4,-4},
             {1,4,-5},{2,4,-6},{-6,5,1},{-5,5,0},{-4,5,-1},{-3,5,-2},{-2,5,-3},{-1,5,-4},{0,5,-5},{1,5,-6},
             {-6,6,0},{-5,6,-1},{-4,6,-2},{-3,6,-3},{-2,6,-4},{-1,6,-5},{0,6,-6}};
 
     // Array of possible movement directions in the hexagonal grid
     int[][] directions = {
             {1, -1, 0},    // Right
             {-1, 1, 0},     // Left
             {0, 1, -1},     // Down-left
             {0, -1, 1},     // Up-right
             {1, 0, -1},     // Down-right
             {-1, 0, 1}      // Up-left
     };
 
     // Variables to track current game state
     ArrayList<int[]> currentAllies = new ArrayList<>();
     ArrayList<int[]> currentEnemies = new ArrayList<>();
     ArrayList<Polygon> hexList = new ArrayList<>();
     int tempSize, maxEnemy;
     int victoryState = 0;
     int inBounds = 0;
 
     /**
      * Handles mouse click events on hexagons
      * @param event The mouse event that triggered this method
      */
     @FXML
     void gteHexID(MouseEvent event) throws InterruptedException {
         Polygon hexagon = (Polygon) event.getSource();
         String id = hexagon.getId().substring(3);
         int coordinateFinder = Integer.parseInt(id);
         int[] coordinates = findCoords(coordinateFinder);
         if (victoryState != 0) {
             for (Polygon hex : hexList){
                 hex.setFill(DODGERBLUE);
             }
             victoryState = 0;
         }else if (hexList.get(coordinateFinder-1).getFill() != DODGERBLUE) {
             invalidMoveText.setText("invalid move");
         } else if (isNCM(coordinates, circ01.getFill())) {
             Paint current = circ01.getFill();
             hexagon.setFill(circ01.getFill());
             circ01.setFill(getTurn(current, hexagon.getId()));
             invalidMoveText.setText("");
         } else if (isCM(coordinates, circ01.getFill())) {
             for (int[] c : currentEnemies) {
                 hexList.get(findId(c)).setFill(DODGERBLUE);
             }
             hexagon.setFill(circ01.getFill());
             isWin();
 
         }else{
             invalidMoveText.setText("invalid move");
         }
     }
 
     /**
      * Determines the next player's turn
      * @param current The current player's color
      * @param hexagonID The ID of the clicked hexagon
      * @return The color of the next player
      */
     Paint getTurn(Paint current, String hexagonID) {
         if (current == RED) {
             return BLUE;
         }
         return RED;
     }
 
     /**
      * Finds the coordinates for a given hexagon ID
      * @param id The hexagon ID to find coordinates for
      * @return The coordinates of the hexagon
      */
     int[] findCoords(int id){
         return coords[id-1];
     }
 
     /**
      * Finds the ID for a given set of coordinates
      * @param coord The coordinates to find the ID for
      * @return The ID of the hexagon at the given coordinates
      */
     int findId(int[] coord){
         for (int i = 0; i < coords.length; i++) {
             if (Arrays.equals(coord, coords[i])) {
                 return i;
             }
         }
         return 0;
     }
 
     /**
      * Checks if a move is a non-capture move
      * @param c The coordinates to check
      * @param colour The color of the current player
      * @return True if the move is a non-capture move, false otherwise
      */
     Boolean isNCM(int[] c, Paint colour){
         for (int[] dir : directions) {
             int[] neighbor = {c[0] + dir[0], c[1] + dir[1], c[2] + dir[2]};
             if (neighbor[0] > 6 || neighbor[0] < -6 || neighbor[1] > 6 || neighbor[1] < -6 || neighbor[2] > 6 || neighbor[2] < -6) {
                 continue;
             }
             // Check against reds
             if (colour == RED) {
                 if(hexList.get(findId(neighbor)).getFill() == RED){
                     return false;
                 }
             }
             // Check against blues
             else if (colour == BLUE) {
                 if(hexList.get(findId(neighbor)).getFill() == BLUE){
                     return false;
                 }
             }
         }
         return true;
     }
 
     /**
      * Checks if a move is a capture move
      * @param c The coordinates to check
      * @param colour The color of the current player
      * @return True if the move is a capture move, false otherwise
      */
     Boolean isCM(int[] c, Paint colour){
         currentAllies.clear();
         currentEnemies.clear();
         maxEnemy = 0;
 
         scan(c, colour);
         return (currentAllies.size() + 1) > maxEnemy && maxEnemy != 0;
     }
 
     /**
      * Scans the surrounding hexagons for allies and enemies
      * @param c The coordinates to scan from
      * @param colour The color of the current player
      */
     void scan(int[] c, Paint colour){
         for (int[] dir : directions) {
             int[] neighbor = {c[0] + dir[0], c[1] + dir[1], c[2] + dir[2]};
             int inBounds = 0;
             for (int[] i : coords) {
                 if (Arrays.equals(neighbor, i)) {
                     inBounds = 1;
                 }
             }
             if (inBounds == 0) {
                 continue;
             }else if(hexList.get(findId(neighbor)).getFill() == colour){
                 friendSize(neighbor, colour);
             } else if(hexList.get(findId(neighbor)).getFill() != colour && hexList.get(findId(neighbor)).getFill() != DODGERBLUE){
                 enemySize(neighbor, colour);
                 tempSize = 0;
             }
         }
     }
 
     /**
      * Recursively calculates the size of a group of allied hexagons
      * @param c The coordinates to start from
      * @param colour The color of the current player
      */
     void friendSize(int[] c, Paint colour) {
         // Skip if already counted
         for (int[] i : currentAllies) {
             if (Arrays.equals(c, i)) {
                 return;
             }
         }
         currentAllies.add(c);
         scan(c, colour);
 
         return;
     }
 
     /**
      * Recursively calculates the size of a group of enemy hexagons
      * @param c The coordinates to start from
      * @param colour The color of the current player
      */
     void enemySize(int[] c, Paint colour) {
         // Skip if already counted
         for (int[] i : currentEnemies) {
             if (Arrays.equals(c, i)) {
                 return;
             }
         }
         currentEnemies.add(c);
         tempSize += 1;
         
         // Check all neighboring hexagons
         for (int[] dir : directions) {
             int[] neighbor = {c[0] + dir[0], c[1] + dir[1], c[2] + dir[2]};
 
             int inBounds = 0;
             for (int[] i : coords) {
                 if (Arrays.equals(neighbor, i)) {
                     inBounds = 1;
                 }
             }
             if (inBounds == 0) {
                 continue;
             }else if(hexList.get(findId(neighbor)).getFill() != colour && hexList.get(findId(neighbor)).getFill() != DODGERBLUE){
                 enemySize(neighbor, colour);
             }
         }
         
         // Update maximum enemy group size if needed
         if (tempSize > maxEnemy) {
             maxEnemy = tempSize;
         }
 
         return;
     }
 
     /**
      * Checks if either player has won the game
      */
     void isWin() {
         int reds = 0;
         int blues = 0;
         
         // Count remaining pieces for each player
         for (Polygon a : hexList) {
             if (a.getFill() == BLUE) {
                 blues += 1;
             } else if (a.getFill() == RED) {
                 reds += 1;
             }
         }
 
         // Check for victory conditions
         if (reds == 0) {
             victoryState = 1;
             invalidMoveText.setText("Blue Wins (click for next game)");
             return;
         } else if(blues == 0){
             victoryState = 1;
             invalidMoveText.setText("Red Wins (click for next game)");
             return;
         }
         invalidMoveText.setText("");
         return;
     }
 
 
 
 
     @FXML
     void initialize() {
         assert circ01 != null : "fx:id=\"circ01\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex1 != null : "fx:id=\"hex1\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex10 != null : "fx:id=\"hex10\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex100 != null : "fx:id=\"hex100\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex101 != null : "fx:id=\"hex101\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex102 != null : "fx:id=\"hex102\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex103 != null : "fx:id=\"hex103\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex104 != null : "fx:id=\"hex104\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex105 != null : "fx:id=\"hex105\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex106 != null : "fx:id=\"hex106\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex107 != null : "fx:id=\"hex107\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex108 != null : "fx:id=\"hex108\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex109 != null : "fx:id=\"hex109\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex11 != null : "fx:id=\"hex11\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex110 != null : "fx:id=\"hex110\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex111 != null : "fx:id=\"hex111\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex112 != null : "fx:id=\"hex112\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex113 != null : "fx:id=\"hex113\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex114 != null : "fx:id=\"hex114\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex115 != null : "fx:id=\"hex115\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex116 != null : "fx:id=\"hex116\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex117 != null : "fx:id=\"hex117\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex118 != null : "fx:id=\"hex118\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex119 != null : "fx:id=\"hex119\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex12 != null : "fx:id=\"hex12\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex120 != null : "fx:id=\"hex120\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex121 != null : "fx:id=\"hex121\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex122 != null : "fx:id=\"hex122\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex123 != null : "fx:id=\"hex123\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex124 != null : "fx:id=\"hex124\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex125 != null : "fx:id=\"hex125\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex126 != null : "fx:id=\"hex126\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex127 != null : "fx:id=\"hex127\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex13 != null : "fx:id=\"hex13\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex14 != null : "fx:id=\"hex14\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex15 != null : "fx:id=\"hex15\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex16 != null : "fx:id=\"hex16\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex17 != null : "fx:id=\"hex17\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex18 != null : "fx:id=\"hex18\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex19 != null : "fx:id=\"hex19\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex2 != null : "fx:id=\"hex2\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex20 != null : "fx:id=\"hex20\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex21 != null : "fx:id=\"hex21\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex22 != null : "fx:id=\"hex22\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex23 != null : "fx:id=\"hex23\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex24 != null : "fx:id=\"hex24\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex25 != null : "fx:id=\"hex25\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex26 != null : "fx:id=\"hex26\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex27 != null : "fx:id=\"hex27\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex28 != null : "fx:id=\"hex28\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex29 != null : "fx:id=\"hex29\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex3 != null : "fx:id=\"hex3\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex30 != null : "fx:id=\"hex30\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex31 != null : "fx:id=\"hex31\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex32 != null : "fx:id=\"hex32\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex33 != null : "fx:id=\"hex33\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex34 != null : "fx:id=\"hex34\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex35 != null : "fx:id=\"hex35\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex36 != null : "fx:id=\"hex36\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex37 != null : "fx:id=\"hex37\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex38 != null : "fx:id=\"hex38\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex39 != null : "fx:id=\"hex39\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex4 != null : "fx:id=\"hex4\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex40 != null : "fx:id=\"hex40\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex41 != null : "fx:id=\"hex41\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex42 != null : "fx:id=\"hex42\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex43 != null : "fx:id=\"hex43\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex44 != null : "fx:id=\"hex44\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex45 != null : "fx:id=\"hex45\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex46 != null : "fx:id=\"hex46\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex47 != null : "fx:id=\"hex47\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex48 != null : "fx:id=\"hex48\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex49 != null : "fx:id=\"hex49\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex5 != null : "fx:id=\"hex5\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex50 != null : "fx:id=\"hex50\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex51 != null : "fx:id=\"hex51\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex52 != null : "fx:id=\"hex52\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex53 != null : "fx:id=\"hex53\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex54 != null : "fx:id=\"hex54\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex55 != null : "fx:id=\"hex55\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex56 != null : "fx:id=\"hex56\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex57 != null : "fx:id=\"hex57\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex58 != null : "fx:id=\"hex58\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex59 != null : "fx:id=\"hex59\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex6 != null : "fx:id=\"hex6\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex60 != null : "fx:id=\"hex60\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex61 != null : "fx:id=\"hex61\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex62 != null : "fx:id=\"hex62\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex63 != null : "fx:id=\"hex63\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex64 != null : "fx:id=\"hex64\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex65 != null : "fx:id=\"hex65\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex66 != null : "fx:id=\"hex66\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex67 != null : "fx:id=\"hex67\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex68 != null : "fx:id=\"hex68\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex69 != null : "fx:id=\"hex69\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex7 != null : "fx:id=\"hex7\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex70 != null : "fx:id=\"hex70\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex71 != null : "fx:id=\"hex71\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex72 != null : "fx:id=\"hex72\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex73 != null : "fx:id=\"hex73\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex74 != null : "fx:id=\"hex74\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex75 != null : "fx:id=\"hex75\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex76 != null : "fx:id=\"hex76\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex77 != null : "fx:id=\"hex77\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex78 != null : "fx:id=\"hex78\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex79 != null : "fx:id=\"hex79\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex8 != null : "fx:id=\"hex8\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex80 != null : "fx:id=\"hex80\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex81 != null : "fx:id=\"hex81\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex82 != null : "fx:id=\"hex82\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex83 != null : "fx:id=\"hex83\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex84 != null : "fx:id=\"hex84\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex85 != null : "fx:id=\"hex85\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex86 != null : "fx:id=\"hex86\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex87 != null : "fx:id=\"hex87\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex88 != null : "fx:id=\"hex88\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex89 != null : "fx:id=\"hex89\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex9 != null : "fx:id=\"hex9\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex90 != null : "fx:id=\"hex90\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex91 != null : "fx:id=\"hex91\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex92 != null : "fx:id=\"hex92\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex93 != null : "fx:id=\"hex93\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex94 != null : "fx:id=\"hex94\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex95 != null : "fx:id=\"hex95\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex96 != null : "fx:id=\"hex96\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex97 != null : "fx:id=\"hex97\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex98 != null : "fx:id=\"hex98\" was not injected: check your FXML file 'hex-view.fxml'.";
         assert hex99 != null : "fx:id=\"hex99\" was not injected: check your FXML file 'hex-view.fxml'.";
         hexList.add(hex1);
         hexList.add(hex2);
         hexList.add(hex3);
         hexList.add(hex4);
         hexList.add(hex5);
         hexList.add(hex6);
         hexList.add(hex7);
         hexList.add(hex8);
         hexList.add(hex9);
         hexList.add(hex10);
         hexList.add(hex11);
         hexList.add(hex12);
         hexList.add(hex13);
         hexList.add(hex14);
         hexList.add(hex15);
         hexList.add(hex16);
         hexList.add(hex17);
         hexList.add(hex18);
         hexList.add(hex19);
         hexList.add(hex20);
         hexList.add(hex21);
         hexList.add(hex22);
         hexList.add(hex23);
         hexList.add(hex24);
         hexList.add(hex25);
         hexList.add(hex26);
         hexList.add(hex27);
         hexList.add(hex28);
         hexList.add(hex29);
         hexList.add(hex30);
         hexList.add(hex31);
         hexList.add(hex32);
         hexList.add(hex33);
         hexList.add(hex34);
         hexList.add(hex35);
         hexList.add(hex36);
         hexList.add(hex37);
         hexList.add(hex38);
         hexList.add(hex39);
         hexList.add(hex40);
         hexList.add(hex41);
         hexList.add(hex42);
         hexList.add(hex43);
         hexList.add(hex44);
         hexList.add(hex45);
         hexList.add(hex46);
         hexList.add(hex47);
         hexList.add(hex48);
         hexList.add(hex49);
         hexList.add(hex50);
         hexList.add(hex51);
         hexList.add(hex52);
         hexList.add(hex53);
         hexList.add(hex54);
         hexList.add(hex55);
         hexList.add(hex56);
         hexList.add(hex57);
         hexList.add(hex58);
         hexList.add(hex59);
         hexList.add(hex60);
         hexList.add(hex61);
         hexList.add(hex62);
         hexList.add(hex63);
         hexList.add(hex64);
         hexList.add(hex65);
         hexList.add(hex66);
         hexList.add(hex67);
         hexList.add(hex68);
         hexList.add(hex69);
         hexList.add(hex70);
         hexList.add(hex71);
         hexList.add(hex72);
         hexList.add(hex73);
         hexList.add(hex74);
         hexList.add(hex75);
         hexList.add(hex76);
         hexList.add(hex77);
         hexList.add(hex78);
         hexList.add(hex79);
         hexList.add(hex80);
         hexList.add(hex81);
         hexList.add(hex82);
         hexList.add(hex83);
         hexList.add(hex84);
         hexList.add(hex85);
         hexList.add(hex86);
         hexList.add(hex87);
         hexList.add(hex88);
         hexList.add(hex89);
         hexList.add(hex90);
         hexList.add(hex91);
         hexList.add(hex92);
         hexList.add(hex93);
         hexList.add(hex94);
         hexList.add(hex95);
         hexList.add(hex96);
         hexList.add(hex97);
         hexList.add(hex98);
         hexList.add(hex99);
         hexList.add(hex100);
         hexList.add(hex101);
         hexList.add(hex102);
         hexList.add(hex103);
         hexList.add(hex104);
         hexList.add(hex105);
         hexList.add(hex106);
         hexList.add(hex107);
         hexList.add(hex108);
         hexList.add(hex109);
         hexList.add(hex110);
         hexList.add(hex111);
         hexList.add(hex112);
         hexList.add(hex113);
         hexList.add(hex114);
         hexList.add(hex115);
         hexList.add(hex116);
         hexList.add(hex117);
         hexList.add(hex118);
         hexList.add(hex119);
         hexList.add(hex120);
         hexList.add(hex121);
         hexList.add(hex122);
         hexList.add(hex123);
         hexList.add(hex124);
         hexList.add(hex125);
         hexList.add(hex126);
         hexList.add(hex127);
     }
 
 }