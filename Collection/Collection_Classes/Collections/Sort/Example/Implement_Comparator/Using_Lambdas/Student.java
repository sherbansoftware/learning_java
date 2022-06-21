package Collection.Collection_Classes.Collections.Sort.Example.Implement_Comparator.Using_Lambdas;

// Java program to demonstrate working of Comparator
// interface and Collections.sort() to sort according
// to user defined criteria.

import java.util.Comparator;

// A class to represent a student.
class Student implements Comparator<Student> {
    private int rollno;
    private String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    // Used to print student details in main()
    public String toString() {
        return "\n" + this.rollno + " " + this.name +
                " " + this.address;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getRollno(), o2.getRollno());
    }
}

