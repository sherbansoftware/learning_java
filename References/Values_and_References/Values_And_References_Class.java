package References.Values_and_References;

public class Values_And_References_Class {

                                    // passing the variable by value

    // means that passing variables into method in Java is always done by making a copy of that variable

                                       // passing the object by value

   // means that when you call a method and pass a object as parameterthen the variable that contains the reference the
   // object is what is passed



    static int  globalVar = 0;

     public static void main(String[] args) {
        int localValue = 5;
        calculate (localValue);
         System.out.println (localValue);
         System.out.println (globalVar);
    }

    public static void calculate(int var) {
         globalVar = var * 500;
    }
}
