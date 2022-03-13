package Basic_Principles_OOP.Association;


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

public class Association_Class {
    public static void main(String[] args) {
        School newSchool = new School ("Java Class");
        Student stu = new Student ("Vian");

        System.out.println (stu.getStudentName () +
                " is a student of " + School.getSchoolName ());
    }
}
