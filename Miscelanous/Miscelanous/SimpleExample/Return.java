package Miscelanous.Miscelanous.SimpleExample;

@FunctionalInterface
interface Executable1 {
    int execute();
}


class Runner1 {
    public void run(Executable1 e) {
        System.out.println("Executing code block...");
        int value = e.execute();
        System.out.println("return value is: " + value);
    }
}

public class Return {

    public static void main(String[] args) {
        Runner1 runner = new Runner1();
        runner.run(new Executable1() {
            public int execute() {
                System.out.println("Hello there.");
                return 7;
            }
        });
        System.out.println("===============================================");


        runner.run(() -> 8);

    }
}