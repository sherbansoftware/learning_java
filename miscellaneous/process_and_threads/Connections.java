package miscellaneous.process_and_threads;

import java.util.concurrent.Semaphore;

public class Connections {

	private static Connections instance = new Connections();
	private Semaphore semaphore = new Semaphore(15,true);

	private int connections = 0;

	private Connections() {
	}

	public static Connections getInstance() {
		return instance;
	}

	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doConnect();
		} finally {
			semaphore.release();
		}

	}

	public void doConnect() {
		synchronized (this) {
			connections++;
			System.out.println("Current connections " + connections);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}

	}

}
