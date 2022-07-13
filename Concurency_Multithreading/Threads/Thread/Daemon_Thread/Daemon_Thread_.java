package Concurency_Multithreading.Threads.Thread.Daemon_Thread;

/*                                                      Daemon threads


    ○ are threads that

                   * run in the background

                   * and do not prevent our application from exiting if the main thread terminates.


    ○ If the main thread terminates a few scenarios, when we want to create our threads as Daemon

            *  Background tasks that should not block our application from terminating

                   For example, in the text editor application, we have a thread that saves our work every few minutes
                       to a file.If suddenly we want to close our application, we don't really care that this background
                       thread is still running and we don't want wait for it to finish.

             * A second scenario is when we do not have control over the code, being executed in the worker thread and we
                   want to make sure that it will not become a blocker for us to stop the app.

                  Example: Worker thread that uses an external library


 */

public class Daemon_Thread_ {
}
