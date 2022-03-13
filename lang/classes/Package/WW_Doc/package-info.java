package lang.classes.Package.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/Package.html

//    https://www.javatpoint.com/package

class Package_RT {
    Package bytes;
}

/*                                 java.lang Class Package_Members

    java.lang.Object
        java.lang.Package_Members

    All Implemented Interface_Class:

        AnnotatedElement

    public class Package_Members extends Object implements AnnotatedElement

        Package_Members objects contain version information about the implementation and specification of a Java package. This
            versioning information is retrieved and made available by the ClassLoader instance that loaded the class(es).
            Typically, it is stored in the manifest that is distributed with the classes.
        The set of classes that make up the package may implement a particular specification and if so the specification
            title, version number, and vendor strings identify that specification. An application can ask if the package
            is compatible with a particular version, see the isCompatibleWith method for details.

    Specification version numbers use a syntax that consists of nonnegative decimal integers separated by periods ".",
        for example "2.0" or "1.2.3.4.5.6.7". This allows an extensible number to be used to represent major, minor,
            micro, etc. versions. The version specification is described by the following formal grammar:

    SpecificationVersion:
        Digits RefinedVersionopt

    RefinedVersion:

        . Digits
        . Digits RefinedVersion

    Digits:

        Digit
        Digits

    Digit:

        any character for which Character.isDigit(char) returns true, e.g. 0, 1, 2, ...
        The implementation title, version, and vendor strings identify an implementation and are made available conveniently
            to enable accurate reporting of the packages involved when a problem occurs. The contents all three implementation
            strings are vendor specific. The implementation version strings have no specified syntax and should only be
            compared for equality with desired version identifiers.

    Within each ClassLoader instance all classes from the same java package have the same Package_Members object. The static methods
        allow a package to be found by name or the set of all packages known to the current class loader to be found.

    See Also:

        ClassLoader.definePackage(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String,
        java.lang.String, java.lang.String, java.net.URL)

    RELATED

 */ 