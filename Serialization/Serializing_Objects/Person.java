package Serialization.Serializing_Objects;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 4801633306273802062L;
    transient private int id;
    private String name;
    private static int count = 1;
    private static transient final String str = "Serialized";

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is " + count + " Final field :" + str;
    }
}

