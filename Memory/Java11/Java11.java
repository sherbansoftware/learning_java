package Memory.Java11;

import java.util.List;
import java.util.stream.Collectors;

// https://www.baeldung.com/java-11-new-features


public class Java11 {


    public static void main(String[] args) {
       // New String Methods
       // Java 11 adds a few new methods to the String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
       //  Let's see how we can make use of the new methods to extract non-blank, stripped lines from a multi-line string:

        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
     //   assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");

   //     These methods can reduce the amount of boilerplate involved in manipulating string objects, and save us from having to import libraries.
    }

}
