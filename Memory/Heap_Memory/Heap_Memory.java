package Memory.Heap_Memory;

/*                                                  Heap Area

        The JVM allocates the memory for all the class instances and arrays from this area.
        Garbage Collector (GC) reclaims the heap memory for objects. Basically, GC has three phases to reclaim memory from
        objects viz. two minor GC and one major GC.

        The heap memory has three portions:

                * Eden Space

                      – it's a part of Young Generation space. When we create an object, the JVM allocates memory from
                            this space

                * Survivor Space

                       – it's also a part of Young Generation space. Survivor space contains existing objects which have
                             survived the minor GC phases of GC

                * Tenured Space

                        – this is also known as the Old Generation space. It holds long surviving objects. Basically,
                              a threshold is set for Young Generation objects and when this threshold is met, these objects
                              are moved to tenured space.

            JVM creates heap area as soon as it starts up. All the threads of the JVM share this area. The memory for the
                heap area does not need to be contiguous.

 */


public class Heap_Memory {
}
