package Functional_Programming.Streams.Parallel_Stream.Example;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {

    public static void main(String[] args) {
        long time1, time2;
        List<Employee> eList = new ArrayList<Employee>();
        for (int i = 0; i < 100; i++) {
            eList.add(new Employee("john", 20000));
            eList.add(new Employee("Rohn", 3000));
            eList.add(new Employee("Tom", 15000));
            eList.add(new Employee("Bheem", 8000));
            eList.add(new Employee("Shiva", 200));
            eList.add(new Employee("Krishna", 50000));
        }
        //Sequential processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = " + eList.stream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();

        System.out.println("Sequential Stream Time Taken = " + (time2 - time1) + "\n");


        //Parallel processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = " + eList.parallelStream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("Time taken by Parallel processing: " + (time2 - time1));


    }
}

