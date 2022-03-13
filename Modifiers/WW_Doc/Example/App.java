package Modifiers.WW_Doc.Example;

import Modifiers.WW_Doc.Example1.Oak;

public class App {

    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(Plant.ID);
        // works, size is protected different package but inherited from Plant
        System.out.println(new Oak().size);
        // not works, height  is default different package but inherited from Plant
        // System.out.println(new Oak().height;);

    }
}
