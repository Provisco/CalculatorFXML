package sample;

/**
 * Created by codecadet on 14/11/16.
 */
public class CalculatorBrain {

    int result;

    public CalculatorBrain(){
    }


    public int getResult(Operation operation, int number1, int number2) {

        switch (operation) {
            case ADD:
                result = number1 + number2;

            case SUBTRACT:
                result = number1 - number2;

            case MULTIPLY:
                result = number1 * number2;

            case DIVIDE:

                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("You can't divide by zero");
                }


        }

        return result;
    }



}
