package Java8.Lambda_Expressions.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee ("John Doe", 30, 178);
        Employee tim = new Employee ("Tim Buchalka", 21, 181);
        Employee jack = new Employee ("Jack Hill", 40, 179);
        Employee snow = new Employee ("Snow White", 22, 190);
        Employee red = new Employee ("Red RidingHood", 35, 168);
        Employee charming = new Employee ("Prince Charming", 31, 175);

        List<Employee> employees = new ArrayList<> ();
        employees.add (john);
        employees.add (tim);
        employees.add (jack);
        employees.add (snow);
        employees.add (red);
        employees.add (charming);

        printEmployeesByAge (employees, "Employees over 180 cm", employee -> employee.getHeight () > 180);
        printEmployeesByAge (employees, "\nEmployees 30 and under", employee -> employee.getAge () <= 30);

        printEmployeesByAge (employees, "\nEmployees younger than 25", new Predicate<Employee> () {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge () < 25;
            }
        });

        IntPredicate greaterThan15 = new IntPredicate () {
            @Override
            public boolean test(int value) {
                return (value > 10) && (value > 15) ;
            }
        };

        IntPredicate lessThan100 = i -> i < 10;

        System.out.println (greaterThan15.test (10));
        int a = 20;
        System.out.println (greaterThan15.test (a + 5));

        // predicate can be chained using .and -------------------------------------------------------------------------
        System.out.println (greaterThan15.and (lessThan100).test (50));
        System.out.println (greaterThan15.and (lessThan100).test (15));

        Random random = new Random ();
        Supplier<Integer> randomSupplier = () -> random.nextInt (1000);
        for (int i = 0; i < 10; i++) {
            System.out.println (randomSupplier.get ());
        }
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {

        System.out.println (ageText);
        System.out.println ("==================");

        employees.forEach ((employee) -> {
            if (ageCondition.test (employee)) {
                System.out.println (employee.getName ());
            }
        });
    }
}
