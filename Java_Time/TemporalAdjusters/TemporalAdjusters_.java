package Java_Time.TemporalAdjusters;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/temporal/package-summary.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/temporal/TemporalAdjusters.html

/*                                  Class TemporalAdjusters

    Adjusters are a key tool for modifying temporal objects. They exist to externalize the process of

                * adjustment,
                * permitting

            different approaches, as per the strategy design pattern.

    Examples might be an adjuster that sets the date avoiding weekends, or one that sets the date to the last day of the month.

    There are two equivalent ways of using a TemporalAdjuster.

            * The first is to invoke the method on the interface directly.

            * The second is to use Temporal.with(TemporalAdjuster):

   // these two lines are equivalent, but the second approach is recommended

       temporal = thisAdjuster.adjustInto(temporal);

       temporal = temporal.with(thisAdjuster);

    It is recommended to use the second approach, with(TemporalAdjuster), as it is a lot clearer to read in code.
    This class contains a standard set of adjusters, available as static methods. These include:

            * finding the first or last day of the month

            * finding the first day of next month

            * finding the first or last day of the year

            * finding the first day of next year

            * finding the first or last day-of-week within a month, such as "first Wednesday in June"

            * finding the next or previous day-of-week, such as "next Thursday"

    Implementation Requirements:

        All the implementations supplied by the static methods are immutable.

                                                        NOTE

             ? The old java.util.Date class and all other classes used to model dates and times in Java before Java 8 have
                  many inconsistencies and design flaws, including mutability and some poorly chosen offsets, defaults,
                  and naming.

             ? All the date-time objects of the new Date and Time API are immutable.

             ? This new API provides two different time representations to manage the different needs of humans and
                   machines when operating on it.

             ? You can manipulate date and time objects in both an absolute and relative manner, and the result of these
                   manipulations is always a new instance, leaving the original one unchanged.

            ? TemporalAdjusters allow you to manipulate a date in a more complex way than changing one of its values,
                   and you can define and use your own custom date transformations.

            ? You can define a formatter to print and parse date-time objects in a specific format. These formatters can
                  be created from a pattern or programmatically, and they�re all thread-safe.

            ? You can represent a time zone, relative to a specific region/location and as a fixed offset from UTC/Greenwich,
                   and apply it to a date-time object to localize it.

            ? You can use calendar systems different from the ISO-8601 standard system.

 */

public class TemporalAdjusters_ {
}
