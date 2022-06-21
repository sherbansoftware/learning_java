package Java_Time.LocalDateTime;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDateTime.html

/*                                                       LocalDateTime




 */

import java.time.*;

public class LocalDateTime_ {

    public static void main(String[] args) {

        // LocalDateTime UTC

        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));

        System.out.println("UTC time now: " + now);

        LocalDate date = LocalDate.parse("2017-09-21");
        LocalTime time = LocalTime.parse("13:45:20");

        // Creating a LocalDateTime directly or by combining a date and a time

        LocalDateTime dt1 = LocalDateTime.of(2017, Month.SEPTEMBER, 21, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        LocalDateTime ldt = LocalDateTime.now();

    }
}
