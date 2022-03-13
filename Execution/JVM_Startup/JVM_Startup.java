package Execution.JVM_Startup;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html

/*                                                          Java Virtual Machine Startup

    The Java Virtual Machine starts execution by invoking the method main of some specified class, passing it a single argument,
        which is an array of strings. In the examples in this specification, this first class is typically called Test.

    The precise semantics of Java Virtual Machine startup are given in Chapter 5 of The Java Virtual Machine Specification,
        Java SE 8 Edition. Here we present an overview of the process from the viewpoint of the Java programming language.

    The manner in which the initial class is specified to the Java Virtual Machine is beyond the scope of this specification,
        but it is typical, in host environments that use command lines, for the fully-qualified name of the class to be
        specified as a command-line argument and for following command-line arguments to be used as strings to be provided
        as the argument to the method main.

    For example, in a UNIX implementation, the command line:

            java Test reboot Bob Dot Enzo

    will typically start a Java Virtual Machine by invoking method main of class Test (a class in an unnamed package),
        passing it an array containing the four strings "reboot", "Bob", "Dot", and "Enzo".

    We now outline the steps the Java Virtual Machine may take to execute Test, as an example of the loading, linking,
        and initialization processes that are described further in later sections.

 */

public class JVM_Startup {
}
