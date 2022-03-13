package Serialization;

// https://www.baeldung.com/java-serialization

/*                                     What	is Serialization?

       Serialization is the conversion of the state of an object into a static stream (sequence) of bytes that includes
           the object's data as well as information about the object's type and the types of data stored in the object
           which we can then save to :

               * a database,
               * a file
               * or transfer over a network.

.
       Deserialization does the opposite.

    Serialization helps us to save and retrieve the state of an object

        • Serialization => Convert object state to some internal object representation.
        • De-Serialization => The reverse. Convert internal representation to object.

    Two important methods

        • ObjectOutputStream.writeObject() // serialize and write to file
        • ObjectInputStream.readObject() // read from file and deserialize

                                                      NOTE

            * Classes that are eligible for serialization need to implement a special marker interface, Serializable.
            * Serializable interface does not declare any methods to be implemented.
            * Static variables are not serialized
            * The serialization process is instance-independent; for example, we can serialize objects on one platform
                  and deserialize them on another.
            * we can use the keyword transient to ignore class fields during serialization.
            * Inheritance and Composition
                  When a class implements the java.io.Serializable interface,

                      * all its sub-classes are serializable as well.
                      * when an object has a reference to another object, these objects must implement the Serializable
                            interface separately, or else a NotSerializableException will be thrown

                   public class Person implements Serializable {
                       private int age;
                       private String name;
                       private Address country; // must be serializable too
                   }
            * Serial Version UID
                  The JVM associates a version (long) number with each serializable class. We use it to verify that the
                       saved and loaded objects have the same attributes, and thus are compatible on serialization.
                       Most IDEs can generate this number automatically, and it's based on the class name, attributes,
                       and associated access modifiers. Any changes result in a different number, and can cause an
                       InvalidClassException.
                   If a serializable class doesn't declare a serialVersionUID, the JVM will generate one automatically at
                       run-time. However, it's highly recommended that each class declares its serialVersionUID, as the
                       generated one is compiler dependent and thus may result in unexpected InvalidClassExceptions.
            * Custom Serialization in Java
                   Java specifies a default way to serialize objects, but Java classes can override this default behavior.
                   Custom serialization can be particularly useful when trying to serialize an object that has some
                   unserializable attributes. We can do this by providing two methods inside the class that we want to
                   serialize.



*/

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    static String country = "ITALY";
    private int age;
    private String name;
    transient int height;

    public static String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }
}

public class Serialization {
    @Test
    public void whenSerializingAndDeserializing_ThenObjectIsTheSame()
            throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(20);
        person.setName("Joe");

        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        assertTrue(p2.getAge() == person.getAge());
        assertTrue(p2.getName().equals(person.getName()));
    }
}
