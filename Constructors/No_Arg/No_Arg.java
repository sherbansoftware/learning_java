package Constructors.No_Arg;

/*                                                         no-arg constructor:

    Constructor with no arguments is known as no-arg constructor. The signature is same as default constructor, however
        body can have any code unlike default constructor where the body of the constructor is empty.

    Although you may see some people claim that that default and no-arg constructor is same but in fact they are not,
        even if you write public No_Arg() { } in your class No_Arg it cannot be called default constructor since you have
        written the code of it.

 */

public class No_Arg {

    public No_Arg() {
        System.out.println("This is a no argument constructor");
    }

    public static void main(String args[]) {
        new No_Arg();
    }
}
