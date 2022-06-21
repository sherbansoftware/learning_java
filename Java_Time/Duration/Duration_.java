package Java_Time.Duration;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html

/*                                            Duration

    A time-based amount of time, such as '34.5 seconds'.
    This class models a quantity or amount of time in terms of seconds and nanoseconds.
    It can be accessed using other duration-based units, such as minutes and hours.
    In addition, the DAYS unit can be used and is treated as exactly equal to 24 hours,
        thus ignoring daylight savings effects. See Period for the date-based equivalent to this class.

                               The Duration and Period classes share many similar methods

    The common methods of date-time classes representing an interval

            Method                        Static                                        Description

            between                         Yes                        Creates an interval between two points in time

             from                           Yes                         Creates an interval from a temporal unit

               of                           Yes                         Creates an instance of this interval from its
                                                                            constituent parts

             parse                           Yes                        Creates an instance of this interval from a String

             addTo                            No                        Creates a copy of this interval, adding to it
                                                                            the specified temporal object

            get                               No                            Reads part of the state of this interval

          isNegative                          No                        Checks whether this interval is negative,
                                                                            excluding zero
           isZero                             No                        Checks whether this interval is zero-length

           minus                              No                        Creates a copy of this interval with an amount of
                                                                            time subtracted
           multipliedBy                       No                        Creates a copy of this interval multiplied by
                                                                            the given scalar
           negated                            No                        Creates a copy of this interval with the length
                                                                            negated
           plus                               No                        Creates a copy of this interval with an amount
                                                                            of time added
          subtractFrom                        No                        Subtracts this interval from the specified temporal
                                                                             object


 */

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Duration_ {
    Duration threeMinutes = Duration.ofMinutes(3);
    Duration threeMinutes1 = Duration.of(3, ChronoUnit.MINUTES);
    Period tenDays = Period.ofDays(10);
    Period threeWeeks = Period.ofWeeks(3);
    Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);

}
