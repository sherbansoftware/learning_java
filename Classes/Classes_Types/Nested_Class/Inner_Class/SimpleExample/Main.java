package Classes.Classes_Types.Nested_Class.Inner_Class.SimpleExample;

public class Main {
    public static void main(String[] args) {

      //  Robot robot = new Robot(7);
       // robot.start();

        // create an instance of a inner class Brain -- Brain is package-private
        // we NEED outer class object   -- robot

         Robot.Brain brain = new Robot().new Brain();
          brain.think();

        // create a instance of  STATIC class Battery      -- Battery is package-private
        // we don't need outer class object

        Robot.Battery battery = new Robot.Battery();

        battery.charge();
        Robot.Battery.staticM();
    }

}
