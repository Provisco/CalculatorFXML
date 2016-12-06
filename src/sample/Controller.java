package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Controller implements EventHandler<ActionEvent> {

    private CalculatorBrain brain;
    private CalculatorUI ui;


    public CalculatorBrain getBrain() {
        return brain;
    }

    public void setBrain(CalculatorBrain brain) {
        this.brain = brain;
    }

    public CalculatorUI getUi() {
        return ui;
    }

    public void setUi(CalculatorUI ui) {
        this.ui = ui;
    }

   @Override
    public void handle(ActionEvent event) {

       //switch(event)
        //mouse click
        //switch


        System.out.println("Action happened");



    }

    public void setUI(CalculatorUI UI) {
        this.ui = UI;
    }
}
