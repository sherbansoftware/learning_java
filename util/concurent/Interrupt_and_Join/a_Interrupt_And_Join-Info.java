package util.concurent.Interrupt_and_Join;
/*
-------------------------------------------------Interrupt-------------------------------------------------------------

      An interrupt is an indication to a thread that it should stop what it is doing and do something else.
      It's up to the programmer to decide exactly how a thread responds to an interrupt, but it is very common for
      the thread to terminate. This is the usage emphasized in this lesson.

----------------------------------------------------Join---------------------------------------------------------------

      The join method allows one thread to wait for the completion of another. If t is a Thread object whose thread is
      currently executing,
             t.join();
      causes the current thread to pause execution until t's thread terminates.
      Like sleep, join responds to an interrupt by exiting with an InterruptedException.

 */