package Operators.Instance_Of;

class Child extends Parent implements MyInterface {

    int i = 55;
    String str = "Asta e";

    @Override
    public void cry() {
        System.out.println ("Cry");

    }

    public void smile() {
        System.out.println ("Smile");
    }

    @Override
    public String toString() {
        return "Child [i=" + i + ", str=" + str + ", getClass()=" + getClass () + ", hashCode()=" + hashCode ()
                + ", toString()=" + super.toString () + "]";
    }


}

