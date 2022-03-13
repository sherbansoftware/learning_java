package Basic_Principles_OOP.Composition;

import java.util.ArrayList;
import java.util.List;

/*                                                    Composition in Java

    Composition is a more restricted form of Aggregation. Composition can be described as when one class which includes
        another class, is dependent on it in such a way that it cannot functionally exist without the class which is included.
        
    For example a class Car cannot exist without Engine, as it won't be functional anymore.

    The Composition is a way to design or implement the "has-a" relationship. Composition and Inheritance both are
        design techniques.
    The Inheritance is used to implement the "is-a" relationship.
        The "has-a" relationship is used to ensure the code reusability in our program. In Composition, we use an instance
        variable that refers to another object.
    In a simple way, we can say it is a technique through which we can describe the reference between two or more classes.
    And for that, we use the instance variable, which should be created before it is used.

    Key Points

        * The Composition represents a part-of relationship.
        * Both entities are related to each other in the Composition.
        * The Composition between two entities is done when an object contains a composed object, and the composed object
              cannot exist without another entity. For example, if a university HAS-ATest.A college-lists, then a college is
              a whole, and college-lists are parts of that university.
        * Favor Composition over Inheritance.
        * If a university is deleted, then all corresponding colleges for that university should be deleted.

 */


// class College
class College {
    public String name;
    public String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

// University has more than one college.
class University {
    // reference to refer to list of college.
    private final List<College> colleges;

    University(List<College> colleges) {
        this.colleges = colleges;
    }

    // Getting total number of colleges
    public List<College> getTotalCollegesInUniversity() {
        return new ArrayList<> (colleges);
    }
}

public class Composition {
    public static void main(String[] args) {
        // Creating the Objects of College class.
        College c1 = new College ("ABES Engineering College", "Ghaziabad");
        College c2 = new College ("AKG Engineering College", "Ghaziabad");
        College c3 = new College ("ACN College of Engineering & Management Sudies", "Aligarh");

        // Creating list which contains the no. of colleges.
        List<College> college = new ArrayList<College> ();
        college.add (c1);
        college.add (c2);
        college.add (c3);
        University university = new University (college);
        List<College> colleges = university.getTotalCollegesInUniversity ();

        for (College cg : colleges) {
            System.out.println ("Name : " + cg.name
                    + " and "
                    + " Address : " + cg.address);
        }
    }
}