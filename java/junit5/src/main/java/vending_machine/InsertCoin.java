package vending_machine;

public class InsertCoin implements State {

    public Message message = new Message("INSERT COIN");

    @Override
    public Message showMessage() {
        return message;
    }



}
