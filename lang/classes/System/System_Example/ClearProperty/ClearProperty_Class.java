package lang.classes.System.System_Example.ClearProperty;

public class ClearProperty_Class {
    public static void main(String[] args) {
        // checking specific property
        System.out.println(System.getProperty("user.home"));

        // clearing this property
        System.clearProperty("user.home");

        System.out.println(System.getProperty("user.home"));

        // setting specific property
        System.setProperty("user.country", "US");

        // checking property
        System.out.println(System.getProperty("user.country"));

        // checking property other than system property
        // illustrating getProperty(String key, String def)
        System.out.println(System.getProperty("user.password",
                "none of your business"));
    }
}
