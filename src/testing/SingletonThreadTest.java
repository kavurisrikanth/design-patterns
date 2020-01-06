package testing;
import java.util.Random;

import code.Logger;
import code.NumberHolder;

class SingletonThreadTest implements Runnable {

	@Override
	public void run() {
		Random rnd = new Random();
		int num = Math.abs(rnd.nextInt() % 100);
		Logger.get().write("Thread #" + Thread.currentThread().getId() + " -> storing " + num);
		NumberHolder.get().store(num);
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Logger.get().write("Thread #" + Thread.currentThread().getId() + " -> retrieving " + NumberHolder.get().retrieve());
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			(new Thread(new SingletonThreadTest())).start();
		}
	}
}