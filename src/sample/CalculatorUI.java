package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by codecadet on 14/11/16.
 */
public class CalculatorUI {


    private Controller handler;
    private Label display;

    public void start(Stage primaryStage) {


        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        //grid.setGridLinesVisible(true);
        Scene scene = new Scene(grid, 200, 200);
        scene.getStylesheets().add("Style.css");



        String[][] teclas = {
                {"", "", "", ""},
                {"1", "2", "3", "+"},
                {"4", "5", "6", "-"},
                {"7", "8", "9", "*"},
                {"0", "C", "=", "/"}
        };


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Button button = new Button(teclas[i + 1][j]);
                button.setId(teclas[i + 1][j]);
                grid.add(button, j, i + 1);
                button.setOnAction(handler);
            }
        }

        display = new Label();
        display.setId(String.valueOf(display));
        display.setText("0");
        grid.add(display, 0, 0, 4, 1);


        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void addStringDigit(String digit) {
        //
    }


    public void addStringDisplay(String number) {

        display.getText(); // se 0 substitui se não concatena

    }

    public void setHandler(Controller handler) {
        this.handler = handler;
    }
}
