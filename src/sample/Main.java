package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

/*
        //Creat Calculator Components

        CalculatorBrain brain = new CalculatorBrain();



        //Wire Components
        controller.setBrain(brain);

        // ------>   os events vao estar na classe calculatorUI
*/
        Controller controller = new Controller();
        CalculatorUI ui = new CalculatorUI();
        controller.setUI(ui);
        ui.setHandler(controller);
        ui.start(primaryStage);



    }


    public static void main(String[] args) {
        launch(args);
    }
}
