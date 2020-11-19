package edu.realemj.Exercises15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MuffinClicker extends javafx.application.Application {

    private int muffinCnt = 0;

    private class MuffinButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            Button b = (Button)e.getSource();
            muffinCnt++;
            b.setText("" + muffinCnt);
        }
    }

    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        Button gameButton = new Button("0");
        gameButton.setPrefSize(100, 100);

        pane.setCenter(gameButton);

        MuffinButtonHandler ah = new MuffinButtonHandler();
        gameButton.setOnAction(ah);

        Scene scene = new Scene(pane, 200, 200);
        scene.getStylesheets().add("https://web.cs.sunyit.edu/~realemj/files/MuffinClicker.css");
        gameButton.getStyleClass().add("muffin-button");

        primaryStage.setScene(scene);
        primaryStage.setTitle("Muffin Clicker!");
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}

/*
class MuffinButtonHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent e) {

    }
}
 */

