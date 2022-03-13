package Map_.miscelanous;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurentHashMap_Class {

	static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();

	public static void main(String[] args) throws InterruptedException {
		orders.put("Bombay", new AtomicLong());
		orders.put("Mumbay", new AtomicLong());
		orders.put("London", new AtomicLong());
		orders.put("New York", new AtomicLong());

		ExecutorService service = Executors.newFixedThreadPool(4);

		service.submit(ConcurentHashMap_Class::processOrders);
		service.submit(ConcurentHashMap_Class::processOrders);

		service.awaitTermination(2, TimeUnit.SECONDS);
		service.shutdown();
		System.out.println(orders);

	}

	static void processOrders() {
		for (String city : orders.keySet()) {
			for (int i = 0; i < 50; i++) {
				orders.get(city).getAndIncrement();

			}

		}

	}
}
