package Constructors.Parameterized;

/*                                                                    Parameterized constructor

    Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
    Constructor can be called from another constructor using keyword this which must be placed on first line on body constructor


 */

public class Parameterized {

    int empId;
    String empName;

    // non arg constructor
    public Parameterized() {
        // this(44,"Chris");
        System.out.println("First constructor running");
    }


    //parameterized constructor with two parameters
    Parameterized(int id, String name) {
        this();
        this.empId = id;
        this.empName = name;
        System.out.println("Second constructor running");
    }

    void info() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }

    public static void main(String args[]) {
        Parameterized obj1 = new Parameterized(10245, "Chaitanya");
        Parameterized obj2 = new Parameterized(92232, "Negan");
//        obj1.info();
//        obj2.info();
        //       new Parameterized();

    }
}
