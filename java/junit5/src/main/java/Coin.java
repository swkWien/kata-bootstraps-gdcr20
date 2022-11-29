
public enum Coin {

	_50_CT(50), _10_CT(10), _5_CT(5);

	private int value;

	Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
