package lang.classes.ProcessBuilder.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/ProcessBuilder.html

// https://www.geeksforgeeks.org/java-lang-processbuilder-class-java/

class ProcessBuilder_RT {
    ProcessBuilder process;
}

/*               Class ProcessBuilder

    java.lang.Object
        java.lang.ProcessBuilder

    public final class ProcessBuilder extends Object

        This class is used to create operating system processes.
        Each ProcessBuilder instance manages a collection of process attributes. The start() method creates a new Process
            instance with those attributes. The start() method can be invoked repeatedly from the same instance to create
            new subprocesses with identical or related attributes.

    Each process builder manages these process attributes:

        • a command, a list of strings which signifies the external program file to be invoked and its arguments, if any.
            Which string lists represent a valid operating system command is system-dependent. For example, it is common
            for each conceptual argument to be an element in this list, but there are operating systems where programs
            are expected to tokenize command line strings themselves - on such a system a Java implementation might require
            commands to contain exactly two elements.
        • an environment, which is a system-dependent mapping from variables to values. The initial value is a copy of
            the environment of the current process (see System.getenv()).
        • a working directory. The default value is the current working directory of the current process, usually the
            directory named by the system property user.dir.
        • a source of standard input. By default, the subprocess reads input from a pipe. Java code can access this pipe
            via the output stream returned by Process.getOutputStream(). However, standard input may be redirected to
            another source using redirectInput. In this case, Process.getOutputStream() will return a null output stream,
            for which: the write methods always throw IOException the close method does nothing
        • a destination for standard output and standard error. By default, the subprocess writes standard output and
            standard error to pipes. Java code can access these pipes via the input streams returned by Process.getInputStream()
            and Process.getErrorStream(). However, standard output and standard error may be redirected to other destinations
            using redirectOutput and redirectError. In this case, Process.getInputStream() and/or Process.getErrorStream()
            will return a null input stream, for which:

                    the read methods always return -1
                    the available method always returns 0
                    the close method does nothing

    a redirectErrorStream property. Initially, this property is false, meaning that the standard output and error output
        of a subprocess are sent to two separate streams, which can be accessed using the Process.getInputStream() and
        Process.getErrorStream() methods.

    If the value is set to true, then:

                standard error is merged with the standard output and always sent to the same destination (this makes it
                   easier to correlate error messages with the corresponding output)
               the common destination of standard error and standard output can be redirected using redirectOutput any
                   redirection set by the redirectError method is ignored when creating a subprocess the stream returned
                   from Process.getErrorStream() will always be a null input stream Modifying a process builder's attributes
                   will affect processes subsequently started by that object's start() method, but will never affect
                   previously started processes or the Java process itself.

    Most error checking is performed by the start() method. It is possible to modify the state of an object so that start()
        will fail.
        For example, setting the command attribute to an empty list will not throw an exception unless start() is invoked.

    Note
        that this class is not synchronized.
        If multiple threads access a ProcessBuilder instance concurrently, and at least one of the threads modifies one
        of the attributes structurally, it must be synchronized externally.

    Starting a new process which uses the default working directory and environment is easy:

        Process p = new ProcessBuilder("myCommand", "myArg").start();

    Here is an example that starts a process with a modified working directory and environment, and redirects standard
        output and error to be appended to a log file:


                 ProcessBuilder pb = new ProcessBuilder("myCommand", "myArg1", "myArg2");
                 Map<String, String> env = pb.environment();
                 env.put("VAR1", "myValue");
                 env.remove("OTHERVAR");
                 env.put("VAR2", env.get("VAR1") + "suffix");
                 pb.directory(new File("myDir"));
                 File log = new File("log");
                 pb.redirectErrorStream(true);
                 pb.redirectOutput(Redirect.appendTo(log));
                 Process p = pb.start();
                 assert pb.redirectInput() == Redirect.PIPE;
                 assert pb.redirectOutput().file() == log;
                 assert p.getInputStream().read() == -1;

    To start a process with an explicit set of environment variables, first call Map.clear() before adding environment
        variables.

Since:
1.5

    RELATED
     https://mkyong.com/java/java-processbuilder-examples/
     https://www.baeldung.com/java-lang-processbuilder-api

 */ 