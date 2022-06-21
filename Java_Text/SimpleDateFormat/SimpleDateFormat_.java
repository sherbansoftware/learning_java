package Java_Text.SimpleDateFormat;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html


/*                                 SimpleDateFormat

    is a concrete class for formatting and parsing dates in a locale-sensitive manner.
    It allows for formatting (date → text), parsing (text → date), and normalization.


 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_ {
    public static void main(String[] args) {

       // String pattern = "yyyy-MM-dd";
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
