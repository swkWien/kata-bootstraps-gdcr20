import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {

	@Test
	void vendingMachineAcceptsANickel() {
		VendingMachine vendingMachine = new VendingMachine();

		int currentBalance = vendingMachine.insertCoin(5);

		assertThat(currentBalance).isEqualTo(5);
	}
}