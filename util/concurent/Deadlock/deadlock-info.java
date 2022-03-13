package util.concurent.Deadlock;

/*
                                               ==deadlock==

    so a deadlock occurs when two or more threads are blocked on locks and every
    thread that's blocked is holding a lock that another block thread wants

                                               ==for example==

    thread 1 is holding lock 1 and waiting to acquire lock 2 but
    thread 2 is holding lock 2 and waiting to acquire lock 1 because all the
    threads holding the locks are blocked they will never release the locks they're
    holding and so none of the waiting threads will actually ever run

                                                 ==solution==

     now if we made both threads obtain the locks in the same order a deadlock can't occur

* */
