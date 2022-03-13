package Miscelanous;

/*                                                           Interfaces

    Another way to achieve abstraction in Java, is with interfaces.
    An interface is a completely "abstract class" that is used to group related methods with empty bodies:
    except default and static methods which have


        interface Animal {
           public void animalSound(); // interface method (does not have a body)
          public void run(); // interface method (does not have a body)
        }

 */


public class Interface_Class {
    public static void main(String[] args) {
        Interface timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

        System.out.println("Emergency number is: " + Interface.EMERGENCYNUMBER);

        System.out.println("=====================================================================");



    }
}
