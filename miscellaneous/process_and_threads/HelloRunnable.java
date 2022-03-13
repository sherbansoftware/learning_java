package miscellaneous.process_and_threads;

public class HelloRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from HelloRunna a thread!");
		print();
		Thread currentThread = Thread.currentThread();
		System.out.println("Run " + currentThread);

	}

	public void print() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Print method " + currentThread);
	}

	public static void main(String args[]) {

		Thread th = new Thread(new HelloRunnable());
		th.start();
		// new HelloRunnable().print();
		// HelloRunnable.print();
		// Thread currentThread = Thread.currentThread();
		// System.out.println("From main: " + currentThread);
	}

}