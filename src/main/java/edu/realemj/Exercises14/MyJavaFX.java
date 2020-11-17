package edu.realemj.Exercises14;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX
        extends javafx.application.Application {

    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);

        primaryStage.setScene(scene);
        primaryStage.setTitle("HELLO");
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
