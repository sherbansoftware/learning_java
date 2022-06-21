package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.IntSummaryStatistics_.Example;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Doe", "Berlin", 25, 12_000),
                new Employee("John", "Sydney", 22, 9000),
                new Employee("Mary", "Berlin", 29, 13_000),
                new Employee("Mike", "London", 34, 10_500),
                new Employee("Adams", "London", 32, 11_500),
                new Employee("Harry", "Berlin", 35, 12_000));
//
//        double avgAge = employees.stream()
//                .mapToInt(Employee::getAge)
//                .average()
//                .orElse(0);
//
//        int minAge = employees.stream()
//                .mapToInt(Employee::getAge)
//                .min()
//                .orElse(0);
//        int maxAge = employees.stream()
//                .mapToInt(Employee::getAge)
//                .max()
//                .orElse(0);
//        System.out.println("Average age: " + avgAge);
//        System.out.println("Minimum age: " + minAge);
//        System.out.println("Maximum age: " + maxAge);

        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        employees.stream()
                .mapToInt(Employee::getAge)
                .forEach(intSummaryStatistics);

        // The above forEach can be written (expanded as)

        // forEach(a -> intSummaryStatistics.accept(a))

        // or forEach(intSummaryStatistics::accept).

        printIntSummaryStatistics("Int Summary Statistics", intSummaryStatistics);

    }

    public static void printIntSummaryStatistics(String message, IntSummaryStatistics intSummaryStatistics) {
        System.out.println(message);
        System.out.println("Count: " + intSummaryStatistics.getCount());
        System.out.println("Avg: " + intSummaryStatistics.getAverage());
        System.out.println("Min: " + intSummaryStatistics.getMin());
        System.out.println("Max: " + intSummaryStatistics.getMax());
        System.out.println("Sum: " + intSummaryStatistics.getSum());
        System.out.println();
    }

}
