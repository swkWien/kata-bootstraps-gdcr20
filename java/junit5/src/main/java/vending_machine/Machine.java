package vending_machine;

public class Machine {
    public State state = new InsertCoin();

    public String showMessage() {
        Message message = state.showMessage();
        return message.toString();
    }

    public Machine() {
    }
}
