import java.util.Arrays;

public class VendingMachine {
	
	int totalValue = 0;
	
	public int insertCoin(int i) {
		if (Arrays.stream(Coin.values()).anyMatch(coin ->coin.getValue() == i)) {
			totalValue += i;
		}
		return totalValue;
	}
}
