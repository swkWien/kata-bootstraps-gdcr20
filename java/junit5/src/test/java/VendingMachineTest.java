import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {
    @Test
    public void vendingMachineAcceptsAQuarter(){
        VendingMachine vendingMachine = new VendingMachine();

        int currentBalance = vendingMachine.insertCoin(25);

        assertThat(currentBalance).isEqualTo(25);
    }

    @Test
    public void vendingMachineAcceptsANickel(){
        VendingMachine vendingMachine = new VendingMachine();

        int currentBalance = vendingMachine.insertCoin(5);

        assertThat(currentBalance).isEqualTo(5);
    }

    @Test
    public void vendingMachineAcceptsADime(){
        VendingMachine vendingMachine = new VendingMachine();

        int currentBalance = vendingMachine.insertCoin(10);

        assertThat(currentBalance).isEqualTo(10);
    }

    @Test
    public void vendingMachineRejectsAPenny(){
        VendingMachine vendingMachine = new VendingMachine();

        int currentBalance = vendingMachine.insertCoin(1);

        assertThat(currentBalance).isEqualTo(0);
    }

    @Test
    public void rejectedPennyGoesIntoCoinReturnTray(){
        CoinReturnTray coinReturnTray = new CoinReturnTray();
        VendingMachine vendingMachine = new VendingMachine(coinReturnTray);

        vendingMachine.insertCoin(1);

        assertThat(coinReturnTray.empty()).isEqualTo(1);
    }

    @Test
    public void twoRejectedPennyGoIntoCoinReturnTray(){
        CoinReturnTray coinReturnTray = new CoinReturnTray();
        VendingMachine vendingMachine = new VendingMachine(coinReturnTray);

        vendingMachine.insertCoin(1);
        vendingMachine.insertCoin(1);

        assertThat(coinReturnTray.empty()).isEqualTo(2);
    }
}
