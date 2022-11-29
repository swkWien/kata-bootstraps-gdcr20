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
}
