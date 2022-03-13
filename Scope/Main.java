package Scope;

public class Main {
    public static void main(String[] args) {

        ScopeCheck  scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        ScopeCheck.InnerClass innerClass =scopeCheck.new InnerClass();
        System.out.println("varThree is  accessible from here only if it's not private in InnerClass " +innerClass.varThree);

        String varFour = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne is " + scopeInstance.getPriveteVar());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("*******************************************");
        ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        innerClass1.timesTwo();

    }
}
