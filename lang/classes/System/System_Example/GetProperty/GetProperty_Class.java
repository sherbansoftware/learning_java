package lang.classes.System.System_Example.GetProperty;

import static java.lang.System.setProperty;

public class GetProperty_Class {

    public static void main(String[] args) {


        // setting specific property
        setProperty("user.country", "US");

        // checking property
        System.out.println(System.getProperty("user.country"));

        // checking property other than system property
        // illustrating getProperty(String key, String def)
        System.out.println(System.getProperty("user.password",
                "none of your business"));
    }
}

