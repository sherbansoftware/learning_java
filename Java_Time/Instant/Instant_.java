package Java_Time.Instant;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html

/*                                new java.time.Instant class,

    which represents the number of seconds passed since the Unix epoch time, set by convention to
        midnight of January 1, 1970 UTC




 */


import java.time.Instant;

public class Instant_ {
    public static void main(String[] args) {
        Instant.ofEpochSecond(3);
        Instant.ofEpochSecond(3, 0);
        Instant.ofEpochSecond(2, 1_000_000_000);
        Instant.ofEpochSecond(4, -1_000_000_000);

        System.out.println(Instant.now());
    }

}
