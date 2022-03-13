package util.concurent.concurent_interfaces.BlockingQueue.BlockingQueue_is_Implemented_by.SynchronousQueue.SynchronousQueue_Example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/*         SynchronousQueue Java example


        BlockingQueue implementations are designed to be used primarily for producer-consumer queues so let’s see an
             example of producer-consumer using SynchronousQueue. In the example two threads are created one a producer
             thread and another a consumer thread.
        In the consumer thread delay of 3 seconds is introduced using the sleep() method before taking the element out
             of the synchronous queue but the put() method waits until the elements is retrieved rather than trying to
             add another element.

*/

public class SychroQ {
    public static void main(String[] args) {
        BlockingQueue<Integer> bQueue = new SynchronousQueue<>();
        // Producer
        new Thread(()->{
            for(int i = 0; i < 5; i++){
                try {
                    System.out.println("Added to queue-" + i);
                    bQueue.put(i);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(()->{
            for(int i = 0; i < 5; i++){
                try {
                    Thread.sleep(3000);
                    System.out.println("Consumer retrieved- " + bQueue.take());

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
