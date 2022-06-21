package lang.classes.Compiler.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Compiler.html

class Compiler_RT {
    Compiler compl;
}

/*                                            public final class Compiler extends lang.classes.Object

    The Compiler class is provided to support Java-to-native-code compilers and related services. By design, the Compiler
        class does nothing; it serves as a placeholder for a JIT compiler implementation.
    When the Java Virtual Machine first starts, it determines if the system property java.compiler exists. (System
        properties are accessible through System.getProperty(String) and System.getProperty(String, String). If so, it is
        assumed to be the name of a library (with a platform-dependent exact location and type); System.loadLibrary(java.lang.String)
        is called to load that library. If this loading succeeds, the function named java_lang_Compiler_start() in that
        library is called.

    If no compiler is available, these methods do nothing.

    Since:
        JDK1.0



 */