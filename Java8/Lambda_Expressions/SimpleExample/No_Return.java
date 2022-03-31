package Java8.Lambda_Expressions.SimpleExample;

@FunctionalInterface
interface Executable {
    void execute();
}


class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block...");
        e.execute();
    }
}

public class No_Return {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            public void execute() {
                System.out.println("Hello there.");
            }
        });
        System.out.println("===============================================");

        // single line of code
        // runner.run(() -> System.out.println("Hello there using lambda"));

        // multiple lines of code
        runner.run(() -> {
            System.out.println("Hello there using lambda");
            System.out.println("Another line of code");
        });

    }
}

