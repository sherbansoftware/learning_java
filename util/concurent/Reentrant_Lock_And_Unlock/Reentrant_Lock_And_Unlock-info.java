package util.concurent.Reentrant_Lock_And_Unlock;

/*                             use of ReentrantLock

              surrounding the code that we ultimately want to be thread-safe to avoid thread interference
              with .lock and .unlock
              so this is one drawback to using lock objects in that we have to manage this lock process themselves by making

                                           IMPORTANT

               sure we call the .lock and the .unlock
               if we forget to release the lock threads waiting for the lock will then start blocking forever

* */