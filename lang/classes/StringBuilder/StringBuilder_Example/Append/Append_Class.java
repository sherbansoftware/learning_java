package lang.classes.StringBuilder.StringBuilder_Example.Append;

public class Append_Class {
    public static void main(String[] args)
    {
        StringBuilder s = new StringBuilder("Geeksfor");
        s.append("Geeks");
        System.out.println(s); // returns GeeksforGeeks
        s.append(1);
        System.out.println(s); // returns GeeksforGeeks1
    }
}
