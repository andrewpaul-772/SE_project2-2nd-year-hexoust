package comp20050.hexagonalboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HexApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file that contains the UI layout
        FXMLLoader fxmlLoader = new FXMLLoader(HexApplication.class.getResource("hex-view.fxml"));
        // Create a new scene with the loaded FXML content, size 750x750 pixels
        Scene scene = new Scene(fxmlLoader.load(), 750, 750);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch();
    }
}