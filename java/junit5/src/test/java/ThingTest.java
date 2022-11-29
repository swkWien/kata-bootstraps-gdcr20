import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ThingTest {

    @Test
    void vendingMachineShouldAccept10ctAndShowBalanceOf10() {
        VendingMachine vendingMachine = new VendingMachine();
        int balance = vendingMachine.insertCoin(10);
        assertThat(balance).isEqualTo(10);
    }
}
