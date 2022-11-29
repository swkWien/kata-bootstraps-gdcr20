import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class VendingMachineTest {

    @Test
    void vendingMachineShouldAccept10ctAndShowBalanceOf10() {
        VendingMachine vendingMachine = new VendingMachine();
        int balance = vendingMachine.insertCoin(10);
        assertThat(balance).isEqualTo(10);
    }

    @Test
    void vendingMachineShouldAccept5ctAndShowBalanceOf5() {
        VendingMachine vendingMachine = new VendingMachine();
        int balance = vendingMachine.insertCoin(5);
        assertThat(balance).isEqualTo(5);
    }

    @Test
    void vendingMachineShouldNotAccept1ctAndShowBalanceOf0() {
        VendingMachine vendingMachine = new VendingMachine();
        int balance = vendingMachine.insertCoin(1);
        assertThat(balance).isEqualTo(0);
    }

    @Test
    void vendingMachineShouldAccept5Times5ctAndShowBalanceOf25() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(5);
        vendingMachine.insertCoin(5);
        vendingMachine.insertCoin(5);
        vendingMachine.insertCoin(5);
        int balance = vendingMachine.insertCoin(5);
        assertThat(balance).isEqualTo(25);
    }
    
    @Test
    void vendingMachineShouldNotAcceptCoinsAndShowTheirValues() {
    	
    	VendingMachine vendingMachine = new VendingMachine();
    	int balance = 0;
    	
    	Coin[] values = Coin.values();
    	for (Coin coin : values) {
    		balance = vendingMachine.insertCoin(coin.getValue());
		}
    	assertThat(balance).isEqualTo(65);
    }
    
    @Test
    void vendingMachineShouldNotAcceptNonExistingValues() {
    	
    	VendingMachine vendingMachine = new VendingMachine();
    	
    	int balance = vendingMachine.insertCoin(7);
    	
    	assertThat(balance).isEqualTo(0);
    }

}
