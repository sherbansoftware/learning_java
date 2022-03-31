package Object.Equals.SimpleExample;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class App {


    public static void main(String[] args) {

        Person person1 = new Person(24, "John");
        Person person2 = new Person(24, "John");
       // System.out.println(person1.equals(person2));  // true

        System.out.println(person1.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person1.equals(person2)); // true
        System.out.println(person1 == person2); // false

        // float and double return false to (==)

        Float value1 = 7f;
        Float value2 = 7f;

        // System.out.println(value1 == value2); // false

        String str1 = new String("String");
        String str2 = new String("String");
        //System.out.println(str1 == str2);  // false
       // System.out.println(str1.equals(str2));  // true
        String str3 ="Hello";
        String str4 ="Hello";
       // System.out.println(str3.hashCode() +" " + str4.hashCode());
       // String str5 = "Hellokuhiuh".substring(0,5);



        //System.out.println(str3 == str4);  // true because points to same memory location

    }

}
