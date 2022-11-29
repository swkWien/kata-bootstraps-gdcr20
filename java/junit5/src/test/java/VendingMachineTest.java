import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {

	@Test
	void vendingMachineAcceptsANickel() {
		CointReturnTray cointReturnTray = new CointReturnTray();
		VendingMachine vendingMachine = new VendingMachine(cointReturnTray);

		int currentBalance = vendingMachine.insertCoin(5);

		assertThat(currentBalance).isEqualTo(5);
	}

	@Test
	void vendingMachineAcceptsADime() {
		CointReturnTray cointReturnTray = new CointReturnTray();
		VendingMachine vendingMachine = new VendingMachine(cointReturnTray);

		int currentBalance = vendingMachine.insertCoin(10);

		assertThat(currentBalance).isEqualTo(10);
	}

	@Test
	void vendingMachineAcceptsAQuarter() {
		CointReturnTray cointReturnTray = new CointReturnTray();
		VendingMachine vendingMachine = new VendingMachine(cointReturnTray);

		int currentBalance = vendingMachine.insertCoin(25);

		assertThat(currentBalance).isEqualTo(25);
	}

	@Test
	void vendingMachineDoesNotAcceptAPenny() {
		CointReturnTray cointReturnTray = new CointReturnTray();
		VendingMachine vendingMachine = new VendingMachine(cointReturnTray);

		int currentBalance = vendingMachine.insertCoin(1);

		assertThat(currentBalance).isEqualTo(0);
		assertThat(cointReturnTray.empty()).isEqualTo(1);
	}
}