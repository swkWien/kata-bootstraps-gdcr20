public class VendingMachine {

    private final CoinReturnTray coinReturnTray;

    public VendingMachine(){
        this.coinReturnTray = new CoinReturnTray();
    }
    
    public VendingMachine(CoinReturnTray coinReturnTray){
        this.coinReturnTray = coinReturnTray;
    }

    int insertCoin(int coin){
        if (coin == 1) {
            coinReturnTray.rejectCoin(coin);
            return 0;
        }
        else {
            return coin;
        }
    }
}
