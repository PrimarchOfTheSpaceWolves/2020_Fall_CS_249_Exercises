package edu.realemj.Exercises15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DeepThought extends javafx.application.Application {

    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Button meaningButton = new Button("Answer?");
        pane.getChildren().add(meaningButton);

        AnswerHandler ah = new AnswerHandler();
        meaningButton.setOnAction(ah);

        Scene scene = new Scene(pane, 250, 250);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Deep Thought");
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}

class AnswerHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent e) {
        System.out.println("42");
    }
}
