package lang.classes.Runtime.Runtime_Example;

public class MemoryTest {
    public static void main(String args[]) throws Exception {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory_Address: " + r.totalMemory());
        System.out.println("Free Memory_Address: " + r.freeMemory());
        System.out.println("Available processors: " +  r.availableProcessors());

        for (int i = 0; i < 10000; i++) {
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance, Free Memory_Address: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory_Address: " + r.freeMemory());
    }
}
