package Classes.Nested_Class.Inner_Class.SimpleExample;

public class Robot {
    private int id;
    final String name = "Robert";
    String colour = "red";

    public Robot() {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        class Temp {
            public void doSomething() {
                System.out.println("ID is " + id);
                System.out.println("My name is " + name + " and my colour is " + colour);
            }
        }
        Temp temp = new Temp();
        temp.doSomething();
    }

    class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }

        public static void staticM(){
            System.out.println("Print static method from static class");
        }
    }
}
