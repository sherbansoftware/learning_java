package Java_Time_Format.DateTimeFormatter;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html


/*                                            DateTimeFormatter



 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_ {

    public static void main(String[] args) {
        String europeanDatePattern = "dd.MM.yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        System.out.println(europeanDateFormatter.format(LocalDate.of(2021, 7, 31)));
    }
}
