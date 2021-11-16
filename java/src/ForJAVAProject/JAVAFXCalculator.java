package ForJAVAProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class JAVAFXCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CALdesign.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("JAVAFX 계산기 프로그램");
        primaryStage.show();
    }
}
