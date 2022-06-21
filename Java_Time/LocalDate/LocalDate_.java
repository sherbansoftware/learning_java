package Java_Time.LocalDate;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html

/*                                               LocalDate

    ○ A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03.

    ○ LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day.

    ○ Other date fields, such

                   * as day-of-year,

                   * day-of-week

                   * and week-of-year,

           can also be accessed.

      For example, the value "2nd October 2007"  can be stored in a LocalDate.

                                                    NOTE

            * This class is immutable and thread-safe.

 */

import java.time.LocalDate;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
    }




}
