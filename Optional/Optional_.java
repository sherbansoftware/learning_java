package Optional;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html


/*                                                 Module java.base
                                                   Package java.util


    ○ A container object which

                  * may or may not contain a non-null value.

          If a value is present, isPresent() returns true.
          If no value is present, the object is considered empty and isPresent() returns false.

    ○ Additional methods that depend on the presence or absence of a contained value are provided, such as

                 * orElse() (returns a default value if no value is present)

                 * and ifPresent() (performs an action if a value is present).

    ○ This is a value-based class; use of

                 * identity-sensitive operations (including reference equality (==),

                 * identity hash code,

                 * or synchronization) on instances of Optional

         may have unpredictable results and should be avoided.


    ○ Use case Optional from java.util.stream.Stream

                  * Optional<T>	 findAny()

                                - Returns an Optional describing some element of the stream,
                                - or an empty Optional if the stream is empty.

                  * Optional<T>	 findFirst()

                                 - Returns an Optional describing the first element of this stream,

                                 - or an empty Optional if the stream is empty.

                  * Optional<T> 	max(Comparator<? super T> comparator)

                                  - Returns the maximum element of this stream according to the provided Comparator.

                  *  Optional<T>	min(Comparator<? super T> comparator)

                                   - Returns the minimum element of this stream according to the provided Comparator.

                  * Optional<T>	reduce(BinaryOperator<T> accumulator)

                                   - Performs a reduction on the elements of this stream,
                                   - using an associative accumulation function,
                                   - and returns an Optional describing the reduced value, if any.

                  * Optional<T>	filter(Predicate<? super T> predicate)

                                    - If a value is present, and the value matches the given predicate,
                                    - return an Optional describing the value,
                                    - otherwise return an empty Optional.


                                                 NOTE


            * Optional is primarily intended for use as a method return type where there is a clear need to represent
                   "no result," and where using null is likely to cause errors.

            * A variable whose type is Optional should never itself be null;
            * It should always point to an Optional instance.



 */

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Optional_ {

    public static void main(String[] args) {
        List<String> ls = List.of("John", "Mary", "Anne");

     Optional match  =   Optional.of(ls.contains("John"));

        System.out.println(match);

    }


}
