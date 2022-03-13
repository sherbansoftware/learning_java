package Java.Pass_By_Value.Example;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person("John", 21);
        Person person2;

        person2 = person1;

        person2.changeDetails("Mary", 30);
        System.out.println(person1);
    }
}
