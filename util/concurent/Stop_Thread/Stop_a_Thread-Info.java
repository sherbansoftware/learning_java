package util.concurent.Stop_Thread;

/*
                                             How to Kill a Java Thread

                 Thread.stop() method is deprecated.
                 stop() can lead to monitored objects being corrupted

        Using a Flag---------------------------------------------------------------------------------------------------

               public void stop() {
                     running.set(false);
                }

        Interrupting a Thread------------------------------------------------------------------------------------------

                What happens when sleep() is set to a long interval, or if we're waiting for a lock that might never be
                released?
                We face the risk of blocking for a long period or never terminating cleanly.
                We can create the interrupt() for these situations,

          public void interrupt() {
                 running.set(false);
                 worker.interrupt();
                  }


* */