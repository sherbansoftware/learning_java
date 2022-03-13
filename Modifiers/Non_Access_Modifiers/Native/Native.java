package Modifiers.Non_Access_Modifiers.Native;

//https://www.baeldung.com/java-native

/*                                                 native keyword in Java.

      Simply put, this is a non-access modifier that is used to access methods implemented in a language
          other than Java like C/C++.

                                                    native Methods

      A native method is a Java method (either an instance method or a class method) whose implementation is also written
          in another programming language such as C/C++.

    We can use them to:

    * implement an interface with system calls or libraries written in other programming languages
    * access system or hardware resources that are only reachable from the other language
    * integrate already existing legacy code written in C/C++ into a Java application
    * call a compiled dynamically loaded library with arbitrary code from Java

*/

public class Native {

    public native String getSystemTime();

    static {
        System.loadLibrary ("nativedatetimeutils");
    }

    public static void main(String[] args) {
        new Native();
    }


}
