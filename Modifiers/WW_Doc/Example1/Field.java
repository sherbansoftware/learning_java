package Modifiers.WW_Doc.Example1;

import Modifiers.WW_Doc.Example.Plant;

public class Field extends Plant {

    public  Field() {

        // size is protected;Fields is in the different package as Plant
        System.out.println(size);
    }

}
