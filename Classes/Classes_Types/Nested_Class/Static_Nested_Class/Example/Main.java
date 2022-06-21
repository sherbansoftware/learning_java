package Classes.Classes_Types.Nested_Class.Static_Nested_Class.Example;

public class Main {
    public static void main(String[] args) {

         // create a instance of  STATIC class Battery      -- Battery is package-private
        // we don't need outer class object

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

        // we can access static methods of static nested class
        Robot.Battery.staticM();
    }

}
