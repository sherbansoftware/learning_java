package lang.classes.System.System_Example.currentTimeMillis;

public class CurrentTimeMilli_Class {


    public static void main(String args[]) throws NullPointerException {
        System.out.println("difference between the "
                + "current time and midnight,"
                + " January 1, 1970 UTC is: " +
                System.currentTimeMillis());
        System.out.println("current time in "
                + "nano sec: " +
                System.nanoTime());
    }
}



