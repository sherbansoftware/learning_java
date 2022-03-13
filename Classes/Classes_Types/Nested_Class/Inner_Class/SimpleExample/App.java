package Classes.Classes_Types.Nested_Class.Inner_Class.SimpleExample;

public class App {
    public static void main(String[] args) {

        Robot robot = new Robot(7);
         robot.start();

        // use a instance of robot to create a brain instance
//        Robot.Brain brain =robot.new Brain();
//        brain.think();
        Robot.Battery battery = new Robot.Battery();
        //battery.charge();
    }

}
