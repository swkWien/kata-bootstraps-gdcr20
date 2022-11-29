public class VendingMachine {
	
	public int insertCoin(int i) {
		if (i < 5) {
			return 0;
		}
		return i < 10 ? 5 : 10;
	}
}
