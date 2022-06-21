package lang.classes.Object.Object_Example.Clone.Clone_Example;

public class Test_Clone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s3 = new Student ();

        //creating a object using the object class clone()
        Student s4 = (Student)  s3.clone ();

        System.out.println (s3.equals(s4));
        System.out.println (s4.hashCode ());
    }


}
