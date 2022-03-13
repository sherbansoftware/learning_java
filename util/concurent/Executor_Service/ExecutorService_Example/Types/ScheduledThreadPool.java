package util.concurent.Executor_Service.ExecutorService_Example.Types;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {

		// for scheduling of tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

		// task to run after 10 second delay
		service.schedule(new Task(), 10, TimeUnit.SECONDS);

		// task to run repetedly every 10 second
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

		// task to run repetedly every 10 second after previous task completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);

	}

	static class Task implements Runnable {

		@Override
		public void run() {
			// task that need to run
			// based on schedule
		}

	}
}
