package Miscelanous.InterfacesChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList_ of values to be saved
// and the other to populate the object's fields from an ArrayList_ (parameter).
//
// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Interface_Class, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Interface_Class class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList_.
// There is a whole Java I/O section later in the course where you will get to use files, etc.

public class Main {

    public static void main(String[] args) {
//        Player chrys = new Player("Chrys", 2500, 1200);
//        System.out.println(chrys);
//        saveObject(chrys);
//
//        chrys.setHitPoints(500);
//        chrys.setWeapon("Stormbringer");
//        System.out.println(chrys);
//        saveObject(chrys);
//      //  loadObject(chrys);
//        System.out.println(chrys);
//
//        ISavable werewolf = new Monster("Werewolf", 12, 36);
//        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
//        System.out.println(werewolf);
//        saveObject(werewolf);
        List<ISavable> isList = Arrays.asList(new Player("Chrys", 2500, 1200), new Monster("Werewolf", 12, 36));
        for (ISavable isS : isList) {
            System.out.println(isS.write());
        }
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objToSave) {
        for (int i = 0; i < objToSave.write().size(); i++) {
            System.out.println("Saving " + objToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }

}
