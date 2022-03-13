package Singleton;
/*
                                                         Singleton class

    is a class whose only one instance can be created at any given time in one JVM

*/

public class Singleton_Class {
    private static Singleton_Class single_instance = null;

    private Singleton_Class() {
    }

    public static Singleton_Class getInstance() {

        if (single_instance == null) {
            single_instance = new Singleton_Class ();
        }
        return single_instance;
    }
}
