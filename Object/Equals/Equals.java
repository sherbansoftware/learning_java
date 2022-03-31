package Object.Equals;


/*                         Indicates whether some other object is "equal to" this one.

    The {@code equals} method implements an equivalence relation on non-null object references:
 
   It is reflexive:
  
       for any non-null reference value {@code x}, {@code x.equals(x)} should return {@code true}.
 
   It is symmetric:
 
        for any non-null reference values  {@code x} and {@code y}, {@code x.equals(y)} should return {@code true} if and
        only if {@code y.equals(x)} returns {@code true}.
 
   It is transitive:
 
       for any non-null reference values   {@code x}, {@code y}, and {@code z}, if {@code x.equals(y)} returns {@code true}
       and  {@code y.equals(z)} returns {@code true}, then  {@code x.equals(z)} should return {@code true}.
 
   It is consistent:
 
       for any non-null reference values {@code x} and {@code y}, multiple invocations of {@code x.equals(y)} consistently
       return {@code true} or consistently return {@code false}, provided no information used in {@code equals} comparisons
       on the objects is modified.
 
   For any non-null reference value {@code x},

       {@code x.equals(null)} should return {@code false}.
       The {@code equals} method for class {@code Object} implements the most discriminating possible equivalence relation
       on objects; that is, for any non-null reference values {@code x} and {@code y}, this method returns {@code true} if
       and only if {@code x} and {@code y} refer to the same object  ({@code x == y} has the value {@code true}).

                                   Note that it is generally necessary to override the {@code hashCode}

      method whenever this method is overridden, so as to maintain the general contract for the {@code hashCode} method,
      which states that equal objects must have equal hash codes.
 
  @param    - obj   the reference object with which to compare.
  @return  {@code true} if this object is the same as the obj
           argument; {@code false} otherwise.
  @see     #hashCode()
  @see     java.util.HashMap


public boolean equals(Object obj) {
        return (this == obj);
        }

                                                                NOTE

            * Now, what equals equals (== ) does, is it tells you whether:

                  - two references to objects are pointing at the same  object or not,
                  - or with integers, or numeric values it tells you if if the, those primitive types,
                        if they have the same value.

 */


public class Equals {
    Object obj;
}
