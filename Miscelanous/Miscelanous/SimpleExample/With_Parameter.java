package Miscelanous.Miscelanous.SimpleExample;

interface Executable2 {
    int execute(int a);
}

class Runner2 {
    public int run(Executable2 e) {
        int value = e.execute(12);
        System.out.println("Return value is: " + value);
        return 7;
    }
}

public class With_Parameter {

    public static void main(String[] args) {
        Runner2 runner = new Runner2();

        runner.run(new Executable2() {
            public int execute(int a) {
                System.out.println("Hello there.");
                System.out.println("And hello again.");
                return 7 + a;
            }
        });

        // Lambda expression
        runner.run(a -> 7 + a);

    }
}

