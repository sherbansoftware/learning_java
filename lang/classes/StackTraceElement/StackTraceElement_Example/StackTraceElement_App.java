package lang.classes.StackTraceElement.StackTraceElement_Example;

// https://www.geeksforgeeks.org/java-lang-stacktraceelement-class-java/

public class StackTraceElement_App {

    public static void main(String[] arg) {
        StackTraceElement st1 = new StackTraceElement("foo", "fuction1",
                "StackTrace.java", 1);
        StackTraceElement st2 = new StackTraceElement("bar", "function2",
                "StackTrace.java", 1);

        Object ob = st1.getFileName();

        // checking whether file names are same or not
        System.out.println(st2.getFileName().equals(ob));

        // Java code illustrating getClassName() method.
        System.out.println("Class name of each thread involved:");
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getStackTrace()[i].getClassName());
        }

        // Java code illustrating getFileName() method.
        System.out.println("file name: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getStackTrace()[i].
                    getFileName());

        // Java code illustrating getLineNumber() method.
        System.out.println("line number: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getStackTrace()[i].
                    getLineNumber());

        // Java code illustrating getMethodName() method.
        System.out.println("method name: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getStackTrace()[i].
                    getMethodName());

        // Java code illustrating hashCode() method.
        System.out.println("hash code: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getStackTrace()[i].
                    hashCode());

        // Java code illustrating isNativeMethod() method.
        for (int i = 0; i < 2; i++)
            System.out.println("Is native method: " + Thread.currentThread().getStackTrace()[i].
                    isNativeMethod());

        // Java code illustrating toString() method.
        System.out.println("String equivlaent: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getStackTrace()[i].
                    toString());

    }
}
