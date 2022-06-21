package lang.classes.Boolean.Boolean_Example;

public class BooleanInJava {
    public static void main(String[] args) {
        boolean boolObj1=new Boolean("TRUE");
        boolean boolObj2=new Boolean("FALSE");
        boolean boolObj3=new Boolean("FALSE");
        boolean decision=(boolObj1==boolObj2);  // evaluating values of boolObj1 and boolObj2
        System.out.println("Are the value of boolean objects 1 and 2 equal? "+decision);
        boolean decision2=(boolObj3==boolObj2);  // evaluating values of boolObj2 and boolObj3
        System.out.println("Are the value of boolean objects 2 and 3 equal? "+decision2);
    }
}
