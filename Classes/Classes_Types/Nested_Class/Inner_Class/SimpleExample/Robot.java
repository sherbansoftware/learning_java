package Classes.Classes_Types.Nested_Class.Inner_Class.SimpleExample;

public class Robot {
    private int id;

    private class Brain {

        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }

    }

    final String name = "Robert";
    String colour = "red";

    public Robot(int id) {
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
}
