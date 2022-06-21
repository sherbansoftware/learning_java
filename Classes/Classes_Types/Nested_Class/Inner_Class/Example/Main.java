package Classes.Classes_Types.Nested_Class.Inner_Class.Example;

public class Main {
    public static void main(String[] args) {
        GearBox mcClaren = new GearBox(6);
        mcClaren.operateClutch(true);
        mcClaren.changeGear(1);
        mcClaren.operateClutch(false);
        System.out.println(mcClaren.wheelSpeed(1000));
        mcClaren.changeGear(2);
        System.out.println(mcClaren.wheelSpeed(3000));
        mcClaren.operateClutch(true);
        mcClaren.changeGear(3);
        mcClaren.operateClutch(false);
        System.out.println(mcClaren.wheelSpeed(6000));
    }
}

