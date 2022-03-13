package Basic_Principles_OOP.Inheritance.Inheritance;

public class Car extends Machine {

   public void wideWindShield() {
        System.out.println("Wiping windshield");
    }

    @Override
    public void start() {
        System.out.println("Car is started...");
    }

    public void showInfo() {
        System.out.println("Car name is: " + name);
    }
}
