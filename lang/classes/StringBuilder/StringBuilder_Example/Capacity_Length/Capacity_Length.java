package lang.classes.StringBuilder.StringBuilder_Example.Capacity_Length;

// https://www.geeksforgeeks.org/stringbuffer-class-in-java/

public class Capacity_Length {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("GeeksforGeeks");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of string GeeksforGeeks=" + p);
        System.out.println("Capacity of string GeeksforGeeks=" + q);
    }
}
