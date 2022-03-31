package Packages;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html

/*                                                   Packages

    Programs are organized as sets of packages. Each package has its own set of names for types, which helps to prevent
        name conflicts.

    A top level type is accessible (§6.6) outside the package that declares it only if the type is declared public.

    The naming structure for packages is hierarchical (§7.1). The members of a package are class and interface types (§7.6),
        which are declared in compilation units of the package, and subpackages, which may contain compilation units and
        subpackages of their own.

    A package can be stored in a file system or in a database (§7.2). Packages that are stored in a file system may have
        certain constraints on the organization of their compilation units to allow a simple implementation to find classes
        easily.

    A package consists of a number of compilation units (§7.3). A compilation unit automatically has access to all types
        declared in its package and also automatically imports all of the public types declared in the predefined package
        java.lang.

    For small programs and casual development, a package can be unnamed (§7.4.2) or have a simple name, but if code is to
        be widely distributed, unique package names should be chosen using qualified names. This can prevent the conflicts
        that would otherwise occur if two development groups happened to pick the same package name and these packages
        were later to be used in a single program.

                                                    Package_Members Members

    The members of a package are:

            * its subpackages
            * all the top level class types (§7.6, §8 (Classes))
            * and top level interface types (§9 (Interfaces))

        declared in all the compilation units (§7.3) of the package

                                                   Host Support for Packages

    Each host system determines how packages and compilation units are created and stored
    Packages and compilation units may be stored in:

             * local file system
             * distributed file system
             * some form of database.


                                                  Compilation Units

    CompilationUnit is the goal symbol (§2.1) for the syntactic grammar (§2.3) of Java programs. It is defined by the
        following productions:

        CompilationUnit:
            [PackageDeclaration] {ImportDeclaration} {TypeDeclaration}

    A compilation unit consists of three parts, each of which is optional:

            * A package declaration (§7.4), giving the fully qualified name (§6.7) of the package to which the
                 compilation unit belongs.A compilation unit that has no package declaration is part of an unnamed
                 package (§7.4.2).

            * import declarations (§7.5) that allow types from other packages and static members of types to be referred
                 to using their simple names.
             * Top level type declarations (§7.6) of class and interface types.

                                                    Package_Members Declarations

    A package declaration appears within a compilation unit to indicate the package to which the compilation unit belongs.

                                                     Named Packages

    A package declaration in a compilation unit specifies the name (§6.2) of the package to which the compilation unit belongs.

        PackageDeclaration:
            {PackageModifier} package Identifier {. Identifier} ;
        PackageModifier:
             Annotation

    The package name mentioned in a package declaration must be the fully qualified name of the package (§6.7).

    The scope and shadowing of a package declaration is specified in §6.3 and §6.4.

    The rules for annotation modifiers on a package declaration are specified in §9.7.4 and §9.7.5.

    At most one annotated package declaration is permitted for a given package.

        7.4.2. Unnamed Packages
        7.4.3. Observability of a Package_Members
    7.5. Import Declarations
        7.5.1. Single-Type-Import Declarations
        7.5.2. Type-Import-on-Demand Declarations
        7.5.3. Single-Static-Import Declarations
        7.5.4. Static-Import-on-Demand Declarations
   7.6. Top Level Type Declarations

                                                           Notes

    Packages perform two functions:

        * enable organize the code that enable to find the files you need quickly
        * stopping having conflicts between class names cannot have two classes with same name in the same package,
             must be in different package
        * you reverse the name of your website in order to have a unique name for this package or compilation unit.



 */

public class Packages {
    public static void main(String[] args) {

    }

}
