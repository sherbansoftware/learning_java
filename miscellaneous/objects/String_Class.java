package miscellaneous.objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Class {

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";
        // System.out.println(s1.hashCode() + " " + s2.hashCode());
        // System.out.println("s1=s2 " + (s1 == s2));

        String string = new String("word").intern();// this is interned
        String string1 = new String("word").intern();
        // System.out.println(string.hashCode() + "=" + string1.hashCode());
        // System.out.println("string=string1 " + (string.equals(string1)));
        // System.out.println(string.hashCode() + " " + string1.hashCode());

        String str = "Hello";// String is cashed in the String pool
        String str1 = str.toUpperCase();
        // System.out.println(str1);

        String text = "abehhiehaboefciuabcjab";
        int in = text.indexOf("ab");
        int ins = text.lastIndexOf("ab");
        // System.out.println(in + " " + ins);

        // Match---------------------------------------------------------------------------------------------------------------------
        Pattern pattern = Pattern.compile("ab");
        Matcher match = pattern.matcher(text);

        int occurence = 0;

        while (match.find()) {
            occurence++;
        }
        // System.out.println(occurence);
        // Substring-------------------------------------------------------------------------------------------------------------------------
        String text1 = "Ma duc la plimbare cat vad cu ochii";
        String tex = text1.substring(0, text1.length());
        // System.out.println(tex);

        // Concat,StringBuilder,StringBuffer
        String alltype = "Am cumparat " + 2 + Integer.valueOf(2);
        String go = " de gogosi calde!";
        String concat = alltype.concat(go);
        // System.out.println(concat);
        StringBuilder sBuilder = new StringBuilder("Ieri ").append("am cumparat ").append(45);
        sBuilder.append(" de gogosi!");
        // System.out.println(sBuilder);
        StringBuffer stringBuffer = new StringBuffer(alltype).append(" de gogosi!");
        // System.out.println(stringBuffer);

    }

}
