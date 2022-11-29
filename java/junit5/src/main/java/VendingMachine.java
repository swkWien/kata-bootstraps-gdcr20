public class VendingMachine {
    
    public VendingMachine(){}

    int insertCoin(int coin){
        if (coin == 1) {
            return 0;
        }
        else {
            return coin;
        }
    }
}
