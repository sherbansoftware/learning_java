package Packages.Compilation_Units;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.3

/*                                            Compilation Units


    ○ Compilation Unit is the goal symbol (§2.1) for the syntactic grammar (§2.3) of Java programs.
        It is defined by the following productions:

            CompilationUnit:

            [PackageDeclaration] {ImportDeclaration} {TypeDeclaration}

    ○ A compilation unit consists of three parts, each of which is optional:

                   * A package declaration (§7.4), giving the fully qualified name (§6.7) of the package to which the
                         compilation unit belongs.A compilation unit that has no package declaration is part of an
                         unnamed  package (§7.4.2).

                    * import declarations (§7.5) that allow types from other packages and static members of types to
                          be referred to using their simple names.

                    * Top level type declarations (§7.6) of class and interface types.

     ○ Every compilation unit implicitly imports every public type name declared in the predefined package java.lang,
            as if the declaration import java.lang.*; appeared at the beginning of each compilation unit immediately
            after any package statement. As a result, the names of all those types are available as simple names in
            every compilation unit.

    ○ All the compilation units of the predefined package

                    * java and its subpackages

                              lang
                              and io

                          are always observable.

    ○ For all other packages, the host system determines which compilation units are observable.

      The observability of a compilation unit influences the observability of its package (§7.4.3).

      Types declared in different compilation units can depend on each other, circularly. A Java compiler must arrange to
          compile all such types at the same time.

*/

public class Compilation_Units {
}
