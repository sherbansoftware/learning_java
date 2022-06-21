package Concurency_Multithreading.Concurency.Example;

public class ThreadExample {

        private static String result="";

        private static void hello() throws InterruptedException {
            Thread.sleep(700);
            result = result.concat("Hello");
        }
        private static void world() throws InterruptedException {
            Thread.sleep(600);
            result = result.concat("World");
        }

        public static void main(String[] args) throws InterruptedException {

            Thread helloThread = new Thread(()-> {
                try {
                    hello();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread worldThread = new Thread(()-> {
                try {
                    world();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            //Starting the thread
            helloThread.start();
            worldThread.start();

            //Joining the thread (Waiting for the threads to finish)
            helloThread.join();
            worldThread.join();

            System.out.println("Result is : " + result);

        }
    }
