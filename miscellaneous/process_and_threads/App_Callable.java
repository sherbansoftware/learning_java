package miscellaneous.process_and_threads;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class App_Callable {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		Future<Integer> future = service.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);

				if (duration > 2000) {
					throw new IOException("Sleeping for too much...");
				}

				System.out.println("Starting...");
				Thread.sleep((long) duration);

				return (int) duration;
			}
		});
		service.shutdown();
		try {
			System.out.println("Result is " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
