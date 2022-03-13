package util.concurent.Executor_Service.ExecutorService_Example.Types;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class SingleThreadedExecuted {

public static void main(String[] args) {
		
		// create the pool only i thread
		ExecutorService service = Executors.newSingleThreadExecutor();

		// submit the tasks for execution
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread name " + Thread.currentThread().getName());

	}

	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread name " + Thread.currentThread().getName());
		}

	}
}