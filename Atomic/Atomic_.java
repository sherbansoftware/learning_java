package Atomic;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/package-summary.html


/*                                           Atomic Classes      -java.util.concurrent.atomic


      ○ A small toolkit of classes that support

                         * lock-free

                         * and thread-safe

             programming on single variables.

      * Instances of Atomic classes

                           * maintain values that are accessed and updated using methods otherwise available for fields

                           * using associated atomic VarHandle operations.


                                               VarHandle


      ○ https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/invoke/VarHandle.html



      ○ INSTANCES of classes

                           * AtomicBoolean,

                           * AtomicInteger,

                           * AtomicLong,

                           * and AtomicReference

               each provide

                           * ACCESS

                           * and UPDATES

               to a single variable of the corresponding type.

      ○ Each class also provides appropriate utility methods for that type.

      ○ For example, classes AtomicLong and AtomicInteger

                            * provide atomic increment methods.

                  One application is to generate sequence numbers, as in:

                                                 class Sequencer {
                                                 private final AtomicLong sequenceNumber = new AtomicLong(0);

                                                       public long next() {
                                                       return sequenceNumber.getAndIncrement();
                                                       }
                                                   }

      ○ Arbitrary transformations of the contained value are provided both by

                            * low-level read-modify-write operations such as

                                                   - compareAndSet

                                                   - and by higher-level methods such as getAndUpdate.

      ○ These classes ARE NOT general purpose replacements for:

                                 * java.lang.Integer and related classes.

       ○ They DO NOT DEFINE methods such as

                                  * equals,

                                  * hashCode

                                  * and compareTo.

      ○ Because atomic variables are expected to be mutated,

                                    * they are poor choices for hash table keys.

      ○ The AtomicIntegerArray, AtomicLongArray, and AtomicReferenceArray classes

                                    * further extend atomic operation support

                                                         - to arrays of these types.

      ○ These classes are also notable in providing volatile access semantics for their array elements.


      ○ In addition to classes representing single values and arrays,

                                    * this package contains Updater classes that can be used to obtain

                                                         - compareAndSet

                                                         - and related operations

                                             on any selected volatile field of any selected class.

      ○ These classes

                                     * predate the introduction of VarHandle,

                                     * and are of more limited use.

      ○ AtomicReferenceFieldUpdater,

          AtomicIntegerFieldUpdater,

          and AtomicLongFieldUpdater

                                       * are reflection-based utilities that provide access to the associated field types.

      ○ These are mainly of use in

                                       * atomic data structures in which several volatile fields of the same node (for example,
                                                the links of a tree node) are independently subject to atomic updates.

      ○ These classes enable greater flexibility in

                                       * how

                                       * and when

                           to use atomic updates,

                                       * at the expense of more awkward reflection-based setup,

                                       * less convenient usage,

                                       * and weaker guarantees.

      ○ The AtomicMarkableReference class

                                       * associates a single boolean with a reference.

       ○ For example, this bit might be used inside a data structure to mean that

                                       * the object being referenced has logically been deleted.

                           The AtomicStampedReference class associates

                                       * an integer value

                                       * with a reference.

                           This may be used for example,

                                       * to represent version numbers corresponding to series of updates.
                                       

                                       Atomic Access


    ○ In programming, an atomic action is one

                   * that effectively happens all at once.

           An atomic action cannot stop in the middle:

                   * it either happens completely,

                   * or it doesn't happen at all.

           No side effects of an atomic action are visible until the action is complete.

 */

public class Atomic_ {
}
