package lang.classes.System.System_Example.GetProperties;

import java.util.Properties;

public class GetProperties_Class {

    public static void main(String[] args) {

        /* Use of getProperties() method
            System class refers to the JVM on which you are compling your JAVA code
            getProperty fetches the actual properties
            that JVM on your Sysytem gets from your Operating System
        */

        System.out.println("Following are the JVM information of your OS :");
        System.out.println("");

        // Property Object
        Properties jvm = System.getProperties();
        jvm.list(System.out);
    }
}
