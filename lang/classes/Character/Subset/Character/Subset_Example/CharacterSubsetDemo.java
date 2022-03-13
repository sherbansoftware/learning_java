package lang.classes.Character.Subset.Character.Subset_Example;

// Java Program illustrating the use of Character.Subset class Methods.

import java.lang.*;

public class CharacterSubsetDemo extends Character.Subset {
    CharacterSubsetDemo(String s) {
        // Use of super keyword :
        // Invokes immediate parent class constructor.
        super(s);
    }

    public static void main(String[] args) {
        // Initializing two Subsets.
        CharacterSubsetDemo a = new CharacterSubsetDemo("geeks");
        CharacterSubsetDemo b = new CharacterSubsetDemo("for");

        // use of equals() :
        boolean check2 = a.equals(a);
        System.out.println("Is a equals a ? : " + check2);
        check2 = b.equals(a);
        System.out.println("Is b equals a ? : " + check2);
        System.out.println();

        // Use of hashCode() :
        int check1 = a.hashCode();
        System.out.println("hashCode " + a + " : " + check1);
        check1 = b.hashCode();
        System.out.println("hashCode " + b + " : " + check1);
        System.out.println();

        // Use of toString() :
        System.out.println("a : " + a.toString());
        System.out.println("b : " + b.toString());
    }
}

