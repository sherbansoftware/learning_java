package Functional_Programming.Functional_Interfaces.Customized.Example;

public class LambdaIntroduction {

    public static void main(String[] args) {
//        MyFunctionalInterface funInter = new CallFun();
//		  funInter.funMethod();


        // extended interface using anonymous class --------------------------------------------------------------

//        new MyFunctionalInterface() {
//            @Override
//            public void funMethod() {
//                System.out.println("Extended anonymous interface");
//            }
//        };


      // Extend MyFunctionalInterface using lambda expressions -------------------------------------------------------

//        MyFunctionalInterface funInterLambda = () -> System.out.println("FunctionalMethod");
 //       funInterLambda.funMethod();


        // extended class using anonymous class ---------------------------------------------------------------------
   CallFun fun =   new CallFun() {
            public void funMethod() {
                super.funMethod();
                System.out.println("Extended anonymous class");
            }
        };

        System.out.println(new CallFun().getClass().getName());
        System.out.println(fun.getClass().getName());
    }
}

class CallFun implements MyFunctionalInterface {
    public void funMethod() {
        System.out.println("CallFun class method!");
    }
}

interface MyFunctionalInterface {
    public void funMethod();
    default void f() {
        System.out.println("From default method");
    }
}





