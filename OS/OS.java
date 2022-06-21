package OS;


// https://en.wikipedia.org/wiki/Operating_system

/*                                                          OS

    An operating system (OS) is

            system software

        that manages computer

            * hardware,
            * software resources,
            * and provides common services for computer programs.


                                                    Context switch

    the act of:
                      * Stopping  thread 1,
                      * Scheduling thread 1 out,
                      * Scheduling thread 2 in

    The reason it's important for us to understand context switches is because they are not cheap when we deal with many
        threads and is the price we need to pay for concurrency.
    And when we switched to a different thread, we need to store all this data and restore the resources of another thread
        back to the CPU and memory.

    Too many threads can cause something called

            threshing,

        which means that the operating system actually spends more time in managing threads, like performing those context
            switches instead of doing real productive work, like running our tasks.

    Threads consume less resources than processes.

    As we remember threads inside a process here,
        share a lot of resources among themselves.

    So context switches between two threads in the same process
        are a lot cheaper than context switching between two threads from different processes.

                                            Thread scheduling from OS

    In general, the operating system divides the time into
        moderately sized pieces called

            epochs.

        In each epoch, the operating system allocates a different time slice for each thread.

                                           Dynamic priority

    The decision on how to allocate the time for each thread is based on a

        Dynamic Priority = Static Priority + Bonus(can be negative)

    The static priority
        is set by the developer ahead of time

    And the bonus
        is adjusted by the operating system.

     Each OS has implemented its own scheduling algorithms.


 */

public class OS {
}
