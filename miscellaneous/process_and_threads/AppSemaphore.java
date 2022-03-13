package miscellaneous.process_and_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppSemaphore {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 200; i++) {
			service.submit(new Runnable() {

				@Override
				public void run() {
					Connections.getInstance().connect();
				}
			});

		}
		service.shutdown();
		service.awaitTermination(1, TimeUnit.DAYS);
	}

}
