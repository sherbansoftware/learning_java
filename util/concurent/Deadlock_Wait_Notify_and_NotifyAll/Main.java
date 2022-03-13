package util.concurent.Deadlock_Wait_Notify_and_NotifyAll;

/*
                      ==lang.classes.Object==

  Every object, in addition to having an associated MONITOR, has an associated WAIT SET.
  ATest.A wait set is a set of threads.
  Wait sets are manipulated solely through the methods lang.classes.Object.wait, lang.classes.Object.notify, and lang.classes.Object.notifyAll.

                       ==Deadlock==

  deadlock occurs when two or more threads wait forever for a lock or resource held by another of the threads.

                        ==Livelock==

  two or more threads keep on transferring states between one another

                         ==wait()==

1. wait()
   causes the current thread to wait indefinitely until another thread either invokes notify() for this object or notifyAll().
2. wait(long timeout)
3. wait(long timeout, int nanos)

                         =notify()==

 notify() notifies any one of them to wake up arbitrarily.
 the choice of exactly which thread to wake is non-deterministic and depends upon the implementation.

                       ==notifyAll()=
 this method simply wakes all threads that are waiting on this object's monitor.

* */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished");
             latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
    }
}















