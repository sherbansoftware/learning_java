package miscellaneous.process_and_threads;

public class Class_extends_threads extends Thread {
	public void run() {
		int r = add(9, 5);
		System.out.println(r);
	}

	public static void main(String args[]) {
		(new Class_extends_threads()).start();
	}

	public static int add(int a, int b) {

		return a + b;
	}

}
