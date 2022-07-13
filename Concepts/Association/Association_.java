package Concepts.Association;

// https://www.edureka.co/blog/aggregation-in-java/

/*                                          Association

    ○ is referred as a relation between two separate classes which establishes through their Objects.

    ○ It can be:

                   * one-to-one

                   * one-to-many

                   * many-to-one

                   * many-to-many.


 */

class School {
    private static String name;

    School(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return name;
    }
}

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }
}

// Association between both the classes

public class Association_ {
    public static void main(String[] args) {
        School newSchool = new School ("Java Class");
        Student stu = new Student ("Vivian");

        System.out.println (stu.getStudentName () +
                " is a student of " + School.getSchoolName ());
    }
}
