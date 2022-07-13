package Collection_Framework.Concurrent_Collection_Classes.PriorityBlockingQueue.Example;

// https://howtodoinjava.com/java/collections/java-priorityblockingqueue/


import java.time.LocalDate;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {

        PriorityBlockingQueue<Employee> PriorityBlockingQueue = new PriorityBlockingQueue<>();

        PriorityBlockingQueue.add(new Employee(1l, "AAA", LocalDate.now()));
        PriorityBlockingQueue.add(new Employee(4l, "CCC", LocalDate.now()));
        PriorityBlockingQueue.add(new Employee(5l, "BBB", LocalDate.now()));
        PriorityBlockingQueue.add(new Employee(2l, "FFF", LocalDate.now()));
        PriorityBlockingQueue.add(new Employee(3l, "DDD", LocalDate.now()));
        PriorityBlockingQueue.add(new Employee(6l, "EEE", LocalDate.now()));

        while (true) {
            Employee e = PriorityBlockingQueue.poll();
            System.out.println(e);

            if (e == null) break;
        }
    }
}
