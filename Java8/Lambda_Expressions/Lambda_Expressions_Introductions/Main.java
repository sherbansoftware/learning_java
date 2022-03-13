package Java8.Lambda_Expressions.Lambda_Expressions_Introductions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // one statement method implementation -------------------------------------------------------------------------
        // when the body only had one statement you'd get a compile error if we add the semi colon

        new Thread (() -> System.out.println ("Printing from the Lambda one statement")).start ();

        // multiple statements (lines) method implementation -----------------------------------------------------------

        new Thread (() -> {
            System.out.println ("Printing from the Runnable");
            System.out.println ("Line 2");
            System.out.format ("This is line %d\n", 3);
        }).start ();


        Employee john = new Employee ("John Doe", 30);
        Employee tim = new Employee ("Tim Buchalka", 21);
        Employee jack = new Employee ("Jack Hill", 40);
        Employee snow = new Employee ("Snow White", 22);

        List<Employee> employees = new ArrayList<> ();
        employees.add (john);
        employees.add (tim);
        employees.add (jack);
        employees.add (snow);


        // lambda single statement method implementation ---------------------------------------------------------------

        // Collections_.sort(employees, (e1,e2) -> Integer.compare (e1.getAge (), e2.getAge ()));
        Collections.sort (employees, (e1, e2) -> e1.getName ().compareTo (e1.getName ()));

        // using anonimous class  -------------------------------------------------------------------------------------

//        Collections_.sort(employees, new Comparator<Employee> () {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        for (Employee employee : employees) {
            System.out.println (employee.getName () + " " + employee.getAge ());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}