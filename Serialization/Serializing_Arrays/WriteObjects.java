package Serialization.Serializing_Arrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {

            // Write entire array
            os.writeObject(people);

            // Write arraylist
            os.writeObject(peopleList);

            // Write objects one by one
            os.writeInt(peopleList.size());

            for (Person person : peopleList) {
                os.writeObject(person);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
