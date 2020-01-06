package code;

public class NumberHolder {
	private static NumberHolder instance;
	private int number;
	
	public static NumberHolder get() {
		if (instance == null) {
			instance = new NumberHolder();
		}
		return instance;
	}
	
	private NumberHolder() {}
	
	public void store(int num) {
		number = num;
	}
	
	public int retrieve() {
		return number;
	}
}
