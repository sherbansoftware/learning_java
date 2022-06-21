package lang.classes.Runtime.Example;

public class MemoryTest {
    public static void main(String args[]) throws Exception {
        Runtime r = Runtime.getRuntime();
        Process notepad = r.exec("notepad.exe");
        Thread.sleep(5000);

        notepad.destroyForcibly();
        System.out.println("Exit value: " + notepad.exitValue());

        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());
        System.out.println("Available processors: " + r.availableProcessors());

        for (int i = 0; i < 10000; i++) {
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: " + r.freeMemory());

    }
}
