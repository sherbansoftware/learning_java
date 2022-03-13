package miscellaneous.process_and_threads;

public class SleepMessages {
	public static void main(String args[]) {
		String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
				"ATest.A kid will eat ivy too" };
		try {
			for (int i = 0; i < importantInfo.length; i++) {
				// Pause for 4 seconds
				try {
					Thread.sleep(4000);
					if (Thread.interrupted()) {
					    throw new InterruptedException();
					}
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
					return;
				}
				// Print a message
				System.out.println(importantInfo[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Lenght must be: " + (importantInfo.length - 1) + " not " + e.getMessage());
		} finally {
			System.out.println("End program...");
			// print();
		}

	}

	static void print() {
		System.out.println("New tasks...");
	}
}