package Concurency_Multithreading.Starvation;

/*
                                                         Starvation

             Starvation describes a situation where a thread is unable to gain regular access to shared resources and
             is unable to make progress. This happens when shared resources are made unavailable for long periods
             by "greedy" threads. For example, suppose an object provides a synchronized method that often takes a long
             time to return. If one thread invokes this method frequently, other threads that also need frequent
             synchronized access to the same object will often be blocked.


                                                           Livelock

            ATest.A thread often acts in response to the action of another thread. If the other thread's action is also a
            response to the action of another thread, then livelock may result. As with deadlock, livelocked threads
            are unable to make further progress. However, the threads are not blocked � they are simply too busy
            responding to each other to resume work. This is comparable to two people attempting to pass each other in
            a corridor: Alphonse moves to his left to let Gaston pass, while Gaston moves to his right to let Alphonse
            pass. Seeing that they are still blocking each other, Alphone moves to his right, while Gaston moves to his
             left. They're still blocking each other, so...

 */