package Classes.Nested_Class.Static_Nested_Class.Example;

public class Robot {
    private int id;
    final String name = "Robert";
    String colour = "red";

    public Robot() {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

    }

    static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }

        public static void staticM() {
            System.out.println("Print static method from static class");
        }
    }
}
