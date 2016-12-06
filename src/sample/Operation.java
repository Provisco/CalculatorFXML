package sample;

/**
 * Created by codecadet on 14/11/16.
 */
public enum Operation {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    private Operation (String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }



}
