package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Cast_Array_List;

import java.util.Arrays;
import java.util.List;

public class Cast_Array_List {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList (
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

         //Cast list to object array ----------------------------------------------------------------------------------------
        Object[] StringArray = someBingoNumbers.toArray () ;

        // cast list to specified array
        String[] toStringArray = new String[someBingoNumbers.size ()];

        toStringArray = someBingoNumbers.toArray (toStringArray);
        System.out.println (Arrays.toString (toStringArray));

        List<String> newStringList = Arrays.asList (toStringArray);

        newStringList.forEach (e -> System.out.println (e));



    }
}
