package lang.classes.StringBuffer.StringBuffer_Example.Append;

public class Append_Class {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Geeksfor");
        s.append("Geeks");
        System.out.println(s); // returns GeeksforGeeks
        s.append(1);
        System.out.println(s); // returns GeeksforGeeks1
    }
}
