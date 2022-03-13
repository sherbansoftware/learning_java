package miscellaneous.unsorted;

public class EmptyTest {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					// System.out.println("thi thread name: " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}).start();

		Thread thread = new Thread(new Targhet());
		thread.start();
	}

	static class Targhet implements Runnable {

		@Override
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName() + " starting...");
				Thread.sleep(2000);
				for (int i = 0; i < 6; i++) {
					System.out.println("Hello from targhet" + Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
