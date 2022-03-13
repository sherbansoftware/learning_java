package util.concurent.Syncronisation;
/*
                                             ==Synchronization==
 The process of controlling when threads execute code and therefore when they can access the heap is called SYNCHRONIZATION
 So we can synchronize:

                                            ==instance methods==

 Simply add the synchronized keyword in the method declaration

                                              ==static methods==

 Static methods are synchronized just like instance methods

                                              ==code block==

Sometimes we do not want to synchronize the entire method but only some instructions within it.
This can be achieved by applying synchronized to a block:
THIS is the monitor object, the code inside the block gets synchronized on the monitor object. Simply put, only one thread per monitor object can execute inside that block of code.

public void performSynchronisedTask() {
    synchronized (this) {
        setCount(getCount()+1);
    }
}
                                           ==Static block code=

In case the method is static, we would pass the CLASS NAME in place of the object reference.

public static void performStaticSyncTask(){
    synchronized (SynchronisedBlocks.class) {
        setStaticCount(getStaticCount() + 1);
    }
}
*/

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {

    private int i;

    public void doCountdown() {
         String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        synchronized(this) {
            for(i=10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}