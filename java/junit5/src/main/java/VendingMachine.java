public class VendingMachine {
	
	int totalValue = 0;
	
	public int insertCoin(int i) {
		if (i >= 5) {
			totalValue += i;
		}
		return totalValue;
	}
}
