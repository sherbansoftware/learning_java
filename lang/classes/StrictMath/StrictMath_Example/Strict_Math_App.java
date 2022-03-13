package lang.classes.StrictMath.StrictMath_Example;

public class Strict_Math_App {
    public static void main(String[] args) {
        // Declaring the variables
        int Vali = -1;
        float Valf = .5f;

        // Printing the values
        System.out.println("Initial value of int  : " + Vali);
        System.out.println("Initial value of int  : " + Valf);


        // Use of .abs() method to get the absoluteValue
        int Absi = StrictMath.abs(Vali);
        float Absf = StrictMath.abs(Valf);

        System.out.println("Absolute value of int : " + Absi);
        System.out.println("Absolute value of int : " + Absf);
        System.out.println("");

        // Use of acos() method
        // Value greater than 1, so passing NaN
        double Acosi = StrictMath.acos(60);
        System.out.println("acos value of Acosi : " + Acosi);
        double x = StrictMath.PI;

        // Use of toRadian() method
        x = StrictMath.toRadians(x);
        double Acosj = StrictMath.acos(x);
        System.out.println("acos value of Acosj : " + Acosj);

    }
}
