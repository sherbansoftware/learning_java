package lang.classes.Double.Double_Example;

public class Double_App {
    public static void main(String[] args) {

        // conversion from String

        // Double d = new Double("42.56");

        Double ds = Double.valueOf("66.45");

        Double dbl = 62.32;

        // conversion to integer
        //int i = dbl.intValue();

        // double to string
       String str = dbl.toString();

      String hexa = Double.toHexString(55.65);

        System.out.println(hexa);
    }
}