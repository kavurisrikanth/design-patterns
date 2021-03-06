package code;

public class Logger {
	private static Logger instance;
	
	public static Logger get() {
		if (instance == null) {
			instance = new Logger();
		}
		
		return instance;
	}
	
	private Logger() {}
	
	public void write(String s) {
		System.out.println(s);
	}
}
