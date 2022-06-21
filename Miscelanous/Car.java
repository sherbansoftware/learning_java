package Miscelanous;



public class Car   {

	
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread());
		Thread t = new Thread(() -> {

			System.out.println("My task's starting from Runnable");

		});

		t.start();
		System.out.println(t.getName());
	}
}
//class MyTask extends Thread {
//	
//	
//	public void run() {
//		
//		System.out.println("My task's starting");
//	}
//}
//
//class myClassR implements Runnable {
//
//	@Override
//	public void run() {
//
//		System.out.println("My task's starting from Runnable");
//		
//	}
//	
//}
	
