package Concurency_Multithreading.Threads.Thread.Thread_Interference.Example;

class Counter {

    private int c = 0;

      public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}