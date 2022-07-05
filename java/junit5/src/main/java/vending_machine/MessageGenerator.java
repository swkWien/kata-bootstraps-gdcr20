package vending_machine;
public enum MessageGenerator {
    THANK_YOU("THANK YOU");

        String message;
    MessageGenerator(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
