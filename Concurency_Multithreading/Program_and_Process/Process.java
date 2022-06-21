package Concurency_Multithreading.Program_and_Process;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html

/*                                               Program

    A program can be defined as a set of instructions.
    The program is a passive entity and the process is an active entity.

    When we execute a program, it remains on the
        hard drive of our system and when this program comes into the main memory it becomes a process.

                                                   Process

    Operating system takes the program from the disc and creates an instance of that application in the memory.
    That instance is called a process, and it's also sometimes called a context of an application.
    Process is a program under execution.

        The process can be present on

                 * a hard drive,
                 * memory
                 * or CPU.

    Each process is completely isolated from any other process that runs on the system.

                                               Process contains metadata, like:

                     * the process ID,
                     * the files                - that the application opens for reading and writing the code,
                     * the code                 - program instructions that are going to be executed on the CPU,
                     * the heap,                - which contains all the data, our application needs.
                     * least one thread         - called the main thread.

         The thread contains two main things,

                       * the stack
                             - is a region in memory where

                                   * the local variables are stored
                                   * and functions are executed.

                       * the instruction pointer

                               - is nothing more than a pointer that points to the address of the next instruction that
                                     the thread is going to execute.


    Each thread is executing a different instruction in a different function at any given moment.

 */

public class Process {
}
