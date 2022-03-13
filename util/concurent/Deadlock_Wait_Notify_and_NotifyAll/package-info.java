package util.concurent.Deadlock_Wait_Notify_and_NotifyAll;
/*
                                      ==lang.classes.Object==

  Every object, in addition to having an associated MONITOR, has an associated WAIT SET.
  ATest.A wait set is a set of threads.
  Wait sets are manipulated solely through the methods lang.classes.Object.wait(), lang.classes.Object.notify(), and lang.classes.Object.notifyAll().

                                      ==Deadlock==

  deadlock occurs when two or more threads wait forever for a lock or resource held by another of the threads.

                                      ==Livelock==

  two or more threads keep on transferring states between one another

                                       ==wait()==

          wait() -------------------------------------------------------------------------------------------------------

                causes the current thread to wait indefinitely until another thread either invokes notify() for this
                object or notifyAll().

          wait(long timeout) -------------------------------------------------------------------------------------------

          wait(long timeout, int nanos) --------------------------------------------------------------------------------

                                         =notify()==

          notify() notifies any one of them to wake up arbitrarily.
          the choice of exactly which thread to wake is non-deterministic and depends upon the implementation.

                       ==notifyAll()=

          this method simply wakes all threads that are waiting on this object's monitor.

* */
