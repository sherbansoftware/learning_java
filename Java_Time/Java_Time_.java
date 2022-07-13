package Java_Time;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/package-summary.html


/*                                         Module java.base
                                           Package java.time


    ○ The main API for dates, times, instants, and durations.


            * Instant

                  - a timestamp

            * LocalDate

                   - a date without a time, or any reference to an offset or time-zone

            * LocalTime

                   - a time without a date, or any reference to an offset or time-zone

            * LocalDateTime

                   - combines date and time, but still without any offset or time-zone

             * ZonedDateTime

                   - a "full" date-time with time-zone and resolved offset from UTC/Greenwich


                                                  Duration and Period


    Beyond dates and times, the API also allows the storage of periods and durations of time.

                * Duration

                      is a simple measure of time along the time-line in nanoseconds.

                 * Period

                      expresses an amount of time in units meaningful to humans, such as years or days.

                                               Additional value types

            * Month

                  stores a month on its own. This stores a single month-of-year in isolation, such as 'DECEMBER'.

            * DayOfWeek

                  stores a day-of-week on its own. This stores a single day-of-week in isolation, such as 'TUESDAY'.

            * Year

                  stores a year on its own. This stores a single year in isolation, such as '2010'.

            * YearMonth

                  stores a year and month without a day or time. This stores a year and month, such as '2010-12' and
                  could be used for a credit card expiry.

            * MonthDay

                  stores a month and day without a year or time. This stores a month and day-of-month, such as '--12-03'
                  and could be used to store an annual event like a birthday without storing the year.

            * OffsetTime

                  stores a time and offset from UTC without a date.This stores a date like '11:30+01:00'.

                  The ZoneOffset

                      is of the form '+01:00'.

            * OffsetDateTime

                       stores a date and time and offset from UTC. This stores a date-time like '2010-12-03T11:30+01:00'.
                       This is sometimes found in XML messages and other forms of persistence, but contains less information
                       than a full time-zone.


    The API has a relatively large surface area in terms of number of methods.
    This is made manageable through the use of consistent method prefixes.

                of

                    - static factory method

                parse

                    - static factory method focussed on parsing

                get

                    - gets the value of something

                is

                    - checks if something is true

               with

                   - the immutable equivalent of a setter

              plus

                  - adds an amount to an object

              minus

                  - subtracts an amount from an object

              to

                  - converts this object to another type

              at

                 - combines this object with another, such as date.atTime(time)


 */

public class Java_Time_ {
}
