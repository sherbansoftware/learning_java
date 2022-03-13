package miscellaneous.process_and_threads;

public class Class_Implement_Interface_Runnable implements Runnable {
	public void run() {
		System.out.println("Hello from a thread!");
		String currentName = Thread.currentThread().getName();
		System.out.println(currentName);
	}

	public static void main(String args[]) {
		Thread thread;
		thread = (new Thread(new Class_Implement_Interface_Runnable()));
		thread.start();
	}
}
