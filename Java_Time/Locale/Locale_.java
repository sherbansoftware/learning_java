package Java_Time.Locale;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Locale.html

/*                                             A Locale object

    represents a specific

                * geographical,

                * political,

                * or cultural

        region. An operation that requires a Locale to perform its task is called locale-sensitive and uses the Locale
            to tailor information for the user. For example, displaying a number is a locale-sensitive operation— the
            number should be formatted according to the customs and conventions of the user's native country, region,
            or culture.

    The Locale class provides three constructors:

         Locale(String language)
         Locale(String language, String country)
         Locale(String language, String country, String variant)

*/


import java.util.Locale;

public class Locale_ {

    public static void main(String[] args) {

        // create a new locale
        Locale locale = new Locale("EN", "INDIA");

        // print locale
        System.out.println("Locale: " + locale);

        // print language
        System.out.println("Language: " + locale.getDisplayLanguage());

        // print country
        System.out.println("Country Name: "
                + locale.getDisplayCountry());

        // get a hash code and print it
        System.out.println("HashCode for this locale: " + locale.hashCode());
    }
}
