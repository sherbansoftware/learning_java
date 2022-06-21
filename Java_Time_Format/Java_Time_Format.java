package Java_Time_Format;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/package-summary.html


/*                                                 Module java.base
                                                   Package java.text


    ○ Provides classes and interfaces for handling

                  * text,

                  * dates,

                  * numbers,

                  * and messages

          in a manner independent of natural languages. This means your main application or applet can be written to be

                  * language-independent,

                  * and it can rely upon separate, dynamically-linked localized resources.

           This allows the flexibility of adding localizations for new localizations at any time.

    ○ These classes are capable of formatting dates, numbers, and messages,

                  * parsing;

                  * searching and sorting strings;

                  * and iterating over

                            - characters,
                            - words,
                             - sentences,
                             - and line breaks.

    ○ This package contains three main groups of classes and interfaces:

                   * Classes for iteration over text

                   * Classes for formatting and parsing

                   * Classes for string collation




 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Java_Time_Format {

    public static void main(String[] args) {


// produce a String by using two different formatters:

        LocalDate date = LocalDate.of(2014, 3, 18);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

// parse a String representing a date or a time in that format to re-create the date object itself.
// You can achieve this task by using the parse factory method provided by all the classes of the Date and Time
// API representing a point in time or an  interval:


        DateTimeFormatter italianFormatter =
                DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        String formattedDate = date.format(italianFormatter); // 18. marzo 2014
        LocalDate date2 = LocalDate.parse(formattedDate, italianFormatter);

// Creating a DateTimeFormatter from a pattern

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date11 = LocalDate.of(2014, 3, 18);
        String formattedDate1 = date1.format(formatter);
        LocalDate date22 = LocalDate.parse(formattedDate, formatter);

//Building a DateTimeFormatter

        DateTimeFormatter italianFormatter1 = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);
    }
}
