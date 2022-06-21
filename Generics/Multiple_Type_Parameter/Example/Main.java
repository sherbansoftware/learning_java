package Generics.Multiple_Type_Parameter.Example;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Bin<String,LocalDateTime> bin = new Bin<>();

        bin.setDryTrash("jyguyguy");
        bin.setWetTrash(LocalDateTime.now());

        System.out.println("DryTrash: " + bin.getDryTrash());
        System.out.println("Wet Trash: " + bin.getWetTrash());
    }


}
