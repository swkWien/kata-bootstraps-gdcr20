package vending_machine;

public class Machine {
    public State state = new InsertCoin();
    public String showMessage() {
        return state.showMessage();
    }
    public Machine() {
    }



}
