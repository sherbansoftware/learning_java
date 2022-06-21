package Java_Text.DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/DateFormat.html

/*                                           DateFormat

    is an abstract class for date/time formatting subclasses which formats and parses dates or time in a language-independent
    manner.


 */

public class DateFormat_ {
    public static void main(String[] args) {

        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        System.out.print(date);

    }
}
