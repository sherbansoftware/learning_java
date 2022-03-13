package lang.classes.ProcessBuilder.Redirect.WW_Doc;


//  https://docs.oracle.com/javase/8/docs/api/java/lang/ProcessBuilder.Redirect.html

// https://www.javatips.net/api/java.lang.processbuilder.redirect


class ProcessBuilderRedirect_RT {
        ProcessBuilder.Redirect process;
}

/*                            Class ProcessBuilder.Redirect

    java.lang.Object
        java.lang.ProcessBuilder.Redirect

    Enclosing class:

        ProcessBuilder

    public abstract static class ProcessBuilder.Redirect extends Object

        Represents a source of subprocess input or a destination of subprocess output. Each Redirect instance is one of the following:

                the special value Redirect.PIPE
                the special value Redirect.INHERIT

       a redirection to read from a file, created by an invocation of Redirect.from(File)
       a redirection to write to a file, created by an invocation of Redirect.to(File)
       a redirection to append to a file, created by an invocation of Redirect.appendTo(File)

    Each of the above categories has an associated unique Type.

Since:
1.7

    RELATED



 */