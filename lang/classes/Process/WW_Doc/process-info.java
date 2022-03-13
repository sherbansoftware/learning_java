package lang.classes.Process.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html

// https://www.geeksforgeeks.org/java-lang-process-class-java/

class Process_RT {
    Process process;
}

/*                Class Process

    java.lang.Object
        java.lang.Process

    public abstract class Process extends Object

        The ProcessBuilder.start() and Runtime.exec methods create a native process and return an instance of a subclass
            of Process that can be used to control the process and obtain information about it. The class Process provides
            methods for performing input from the process, performing output to the process, waiting for the process to
            complete, checking the exit status of the process, and destroying (killing) the process.
        The methods that create processes may not work well for special processes on certain native platforms, such as
            native windowing processes, daemon processes, Win16/DOS processes on Microsoft Windows, or shell scripts.

        By default, the created subprocess does not have its own terminal or console. All its standard I/O (i.e. stdin,
            stdout, stderr) operations will be redirected to the parent process, where they can be accessed via the
            streams obtained using the methods getOutputStream(), getInputStream(), and getErrorStream(). The parent
            process uses these streams to feed input to and get output from the subprocess. Because some native platforms
            only provide limited buffer size for standard input and output streams, failure to promptly write the input
            stream or read the output stream of the subprocess may cause the subprocess to block, or even deadlock.

    Where desired, subprocess I/O can also be redirected using methods of the ProcessBuilder class.

    The subprocess is not killed when there are no more references to the Process object, but rather the subprocess
        continues executing asynchronously.

    There is no requirement that a process represented by a Process object execute asynchronously or concurrently with
        respect to the Java process that owns the Process object.

    As of 1.5, ProcessBuilder.start() is the preferred way to create a Process.

    Since:
        JDK1.0

    RELATED

   https://www.baeldung.com/java-process-api

 */ 