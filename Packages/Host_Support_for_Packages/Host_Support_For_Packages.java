package Packages.Host_Support_for_Packages;

//  https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.2

/*                                             Host Support for Packages

    Each host system determines how packages and compilation units are created and stored.

    Each host system also determines which compilation units are observable (§7.3) in a particular compilation. The observability
        of compilation units in turn determines which packages are observable, and which packages are in scope.

    In simple implementations of the Java SE platform, packages and compilation units may be stored in a

             * local file system.
             * distributed file system
             * or some form of database.

    If a host system stores packages and compilation units in a database, then the database must not impose the optional
        restrictions (§7.6) on compilation units permissible in file-based implementations.

    For example, a system that uses a database to store packages may not enforce a maximum of one public class or interface
        per compilation unit.

    Systems that use a database must, however, provide an option to convert a program to a form that obeys the restrictions,
        for purposes of export to file-based implementations.

    As an extremely simple example of storing packages in a file system, all the packages and source and binary code in a
        project might be stored in a single directory and its subdirectories. Each immediate subdirectory of this directory
        would represent a top level package, that is, one whose fully qualified name consists of a single simple name.
        Each further level of subdirectory would represent a subpackage of the package represented by the containing
        directory, and so on.

    The directory might contain the following immediate subdirectories:

            com
            gls
            jag
            java
            wnj

    where directory java would contain the Java SE platform packages; the directories jag, gls, and wnj might contain packages
        that three of the authors of this specification created for their personal use and to share with each other within
        his small group; and the directory com would contain packages procured from companies that used the conventions
        described in §6.1 to generate unique names for their packages.

    Continuing the example, the directory java would contain, among others, the following subdirectories:

            applet
            awt
            io
            lang
            net
            util

    corresponding to the packages java.applet, java.awt, java.io, java.lang, java.net, and java.util that are defined as
        part of the Java SE platform API.

    Still continuing the example, if we were to look inside the directory util, we might see the following files:

            BitSet.java        Observable.java
            BitSet.class       Observable.class
            Date.java          Observer.java
            Date.class         Observer.class
            ...

    where each of the .java files contains the source for a compilation unit (§7.3) that contains the definition of a
        class or interface whose binary compiled form is contained in the corresponding .class file.

    Under this simple organization of packages, an implementation of the Java SE platform would transform a package name
        into a pathname by concatenating the components of the package name, placing a file name separator (directory indicator)
        between adjacent components.

    For example, if this simple organization were used on an operating system where the file name separator is /,
        the package name:

            jag.scrabble.board

     would be transformed into the directory name:

            jag/scrabble/board

    A package name component or class name might contain a character that cannot correctly appear in a host file system's
        ordinary directory name, such as a Unicode character on a system that allows only ASCII characters in file names.
        As a convention, the character can be escaped by using, say, the @ character followed by four hexadecimal digits
        giving the numeric value of the character.

    Under this convention, the package name:

            children.activities.crafts.papierM\u00e2ch\u00e9

    which can also be written using full Unicode as:

            children.activities.crafts.papierMâché

    might be mapped to the directory name:

            children/activities/crafts/papierM@00e2ch@00e9

    If the @ character is not a valid character in a file name for some given host file system, then some other character
        that is not valid in a identifier could be used instead.

*/

public class Host_Support_For_Packages {
}
