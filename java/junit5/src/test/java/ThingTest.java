import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ThingTest {

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
}
