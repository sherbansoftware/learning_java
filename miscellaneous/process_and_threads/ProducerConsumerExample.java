package miscellaneous.process_and_threads;

public class ProducerConsumerExample {
	public static void main(String[] args) {
		Drop drop = new Drop();
		(new Thread(new Producer(drop))).start();
		(new Thread(new Consumer_Class (drop))).start();
	}
}