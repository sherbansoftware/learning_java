package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Object_Array;

public class Student implements Comparable<Student> {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo (student.name);
    }
}
