package miscellaneous.process_and_threads;

class ThreadWaitAndNotify {

	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();

		synchronized (thread) {
			/*try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println(thread.sum);
	}
}