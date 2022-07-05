package vending_machine;

public class InsertCoin implements State {

    public String message = "INSERT COIN";

    @Override
    public String showMessage() {
        return message;
    }



}
