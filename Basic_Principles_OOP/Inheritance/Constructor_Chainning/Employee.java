package Basic_Principles_OOP.Inheritance.Constructor_Chainning;

import java.util.ArrayList;
import java.util.List;

class Employee extends Department {
    public String empName;
    public int empSalary;
    public String address;


    //default constructor of the class
    public Employee() {
        //this will call the constructor with String param
        this ("Chaitanya");
    }

    public Employee(String name) {
        //call the constructor with (String, int) param
        this (name, 120035);
    }

    public Employee(String name, int sal) {
        //call the constructor with (String, int, String) param
        this (name, sal, "Gurgaon");
    }

    public Employee(String name, int sal, String addr) {
        super (name);
        this.empName = name;
        this.empSalary = sal;
        this.address = addr;

    }
    public String getName() {
        return this.empName;
    }

    void disp() {
        System.out.println ("Employee Name: " + empName);
        System.out.println ("Employee Salary: " + empSalary);
        System.out.println ("Employee Address: " + address);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<> ();
        Employee emp1 = new Employee ("John", 1000, "jgfaglqiehg");
        Employee emp2 = new Employee ("Elon", 3000, "jyguyguyg");

        emp1.disp ();
        System.out.println ();
        emp2.disp ();

    }
}


