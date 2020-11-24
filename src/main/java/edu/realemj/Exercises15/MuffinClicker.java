package edu.realemj.Exercises15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MuffinClicker extends javafx.application.Application {

    private int muffinCnt = 0;
    private int clickPower = 1;

    private class MuffinButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            Button b = (Button)e.getSource();
            //muffinCnt++;
            muffinCnt += clickPower;
            b.setText("" + muffinCnt);
        }
    }

    public void start(Stage primaryStage) {

        Button gameButton = new Button("0");
        gameButton.setPrefSize(100, 100);

        //MuffinButtonHandler ah = new MuffinButtonHandler();
        //gameButton.setOnAction(ah);

        gameButton.setOnAction(e -> {
            Button b = (Button)e.getSource();
            muffinCnt += clickPower;
            b.setText("" + muffinCnt);
        });

        gameButton.setOnMouseEntered(m -> {
           System.out.println("MOUSE INSIDE!");
        });

        gameButton.setOnMouseExited(m -> {
            System.out.println("MOUSE LEFT!");
        });

        gameButton.setOnMouseMoved(m -> {
            System.out.println("MOUSE: " + m.getX() + "," + m.getY());
        });

        Button buyClickPower = new Button("Buy Clicking Power");
        buyClickPower.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                if(checkHaveMuffins()) {
                    muffinCnt -= (10*clickPower);
                    clickPower *= 2;
                    buyClickPower.setText("Buy Clicking Power (current: "
                                            + clickPower + ")");
                    gameButton.setText("" + muffinCnt);
                }
            }

            private boolean checkHaveMuffins() {
                return (muffinCnt >= (10*clickPower));
            }
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(gameButton);
        pane.setBottom(buyClickPower);
        BorderPane.setAlignment(buyClickPower, Pos.CENTER);

        Scene scene = new Scene(pane, 200, 200);
        scene.getStylesheets().add("https://web.cs.sunyit.edu/~realemj/files/MuffinClicker.css");
        gameButton.getStyleClass().add("muffin-button");

        scene.setOnKeyPressed(k -> {
            if(k.getCode() == KeyCode.M) {
                muffinCnt += clickPower;
                gameButton.setText("" + muffinCnt);
            }
        });

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

