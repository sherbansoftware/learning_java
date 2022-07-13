package Collection_Framework.Collection_Classes.Collections.Shuffle;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html



/*                                     shuffle  -- 2 methods

    ○ static void	            shuffle(List<?> list)

                  * Randomly permutes the specified list using a default source of randomness.

    ○ static void	               shuffle(List<?> list, Random rnd)

                  * Randomly permute the specified list using the specified source of randomness.


 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shuffle_ {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(21, 2, 66, 47, 58, 94);

        Collections.shuffle(li, new Random());
        Collections.shuffle(li);

        System.out.println(li);
    }
}
