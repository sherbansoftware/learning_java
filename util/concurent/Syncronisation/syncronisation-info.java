package util.concurent.Syncronisation;

/*
                                                Synchronisation

     The process of controlling when threads execute code and therefore when they can access the heap is called synchronization
     So we can synchronize methods and statements now when a method is synchronized only one thread can execute that at a time

     Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of
     communication is extremely efficient, but makes two kinds of errors possible:

                                                     Errors

       Thread interference error -------------------------------------------------------------------------------------

           is a condition which occurs when more than one threads, executing simultaneously, access same piece of data.

       Memory_Address consistency error: ---------------------------------------------------------------------------------------

            Memory_Address consistency is more of an architecture-based concept than Java-based.
            Accesses to main memory might not occur in the same order in which the CPU initiated them
            Memory_Address inconsistency is about visibility and deals with hardware memory.

           The tool needed to prevent these errors is synchronization.

        So we can synchronize:------------------------------------------------------------------------------------------

                                            ==instance methods==

             Simply add the synchronized keyword in the method declaration

                                              ==static methods==

                  public void performSynchronisedTask() {
                                     synchronized (Class) {
                       setCount(getCount()+1);
                        }
              }
             Static methods are synchronized just like instance methods

                                              ==code block==

             Sometimes we do not want to synchronize the entire method but only some instructions within it.
             This can be achieved by applying synchronized to a block:
             THIS is the monitor object, the code inside the block gets synchronized on the monitor object.
             Simply put, only one thread per monitor object can execute inside that block of code.



            every java object has  intrinsic lock and will also see this reference to as a monitor so we can synchronize
            a block of statements that work with an object by forcing threads to acquire the objects lock before they
            execute the statement

                                   synchronize only the code that must be synchronized

            we don't want threads to be suspended or blocked unnecessarily because that can
            affect the performance of an application as well as the user experience

 */