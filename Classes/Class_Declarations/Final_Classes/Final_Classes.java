package Classes.Class_Declarations.Final_Classes;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.1.1.2

/*                                          final Classes

    A class can be declared final if its definition is complete and no subclasses are desired or required.

                                             NOTE

            * It is a compile-time error if the name of a final class appears in the extends clause
                  (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.1.4) of another class declaration;
                  this implies that a final class cannot have any subclasses.

            * It is a compile-time error if a class is declared both final and abstract, because the implementation of
                  such a class could never be completed
                  (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.1.1.1).

            *  Because a final class never has any subclasses, the methods of a final class are never overridden
                   (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.8.1).

*/


final class Final_Classes {
    void showData() {
        System.out.println("This is a method of final Parent class");
    }
}

                            //It will throw compilation error

//class ChildClass extends Final_Classes {
//    void showData() {
//        System.out.println("This is a method of Child class");
//    }
//}
//
//class MainClass {
//    public static void main(String arg[]) {
//        Final_Classes obj = new ChildClass();
//        obj.showData();
//    }
//}