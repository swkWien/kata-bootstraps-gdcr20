public class CoinReturnTray {

    private int rejectedBalance;
    public CoinReturnTray(){}

    public int empty() { 
        return rejectedBalance;
    }

    public void rejectCoin(int rejectedCoin) {
        rejectedBalance += rejectedCoin;
    }
}
