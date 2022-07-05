import org.junit.jupiter.api.Test;
import retreat.VendingMachine;

import static org.assertj.core.api.Assertions.assertThat;


class ThingTest {

    @Test
    void shoul() {
        VendingMachine vendingMachine = new VendingMachine();
        int amount = vendingMachine.acceptCoin("Nickel");
        assertThat(amount)
                .isEqualTo(5);
    }
}
