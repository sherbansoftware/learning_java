package miscellaneous.process_and_threads;

public class Calculator extends Thread {
	long sum;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100000; i++) {
				sum += i;
			}
			notify();
		}
	}

}

