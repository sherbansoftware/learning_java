package Interfaces.Static_Method;




/*                                 static methods


    ○ The static methods in interfaces are similar to default methods but the only difference is

               * that you can’t override them.


               Now, why do we need static methods in interfaces if we already have default methods?


    ○ Suppose you

                * want to provide some implementation in your interface,

                * and you don’t want this implementation to be overridden in the implementing class,

        then you can declare the method as static.

 In the below example, we will define a Vehicle interface with a static method called cleanVehicle().




 */

public class Static_Method implements Vehicles {
    public static void main(String[] args) {
        Vehicles.cleanVehicle();
    }
}
