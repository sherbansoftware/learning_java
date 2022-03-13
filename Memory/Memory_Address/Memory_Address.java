package Memory.Memory_Address;

import org.openjdk.jol.vm.VM;

public class Memory_Address {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("Memory_Address address: " + VM.current().addressOf(obj));
        System.out.println("toString: " + obj);
        System.out.println("hashCode: " + obj.hashCode());
        System.out.println("hashCode: " + System.identityHashCode(obj));

        System.out.println(VM.current().sizeOf(obj));
    }

    /*  output



    Memory_Address address: 32223614928
    toString: java.lang.Object@64a294a6
    hashCode: 1688376486
    hashCode: 1688376486



    Quite interestingly, the “60addb54” is the hexadecimal version of the hash code, which is 1622006612. The hashCode()
        method is one of the common methods for all Java objects. When we don't declare a hashCode() method for a class,
        Java will use the identity hash code for it.

    As shown above, the identity hash code (that part after @ in toString) and the memory address are different.
            */
}
