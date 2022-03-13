package Packages.Import_Declarations;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.5

/*                                                           Import Declarations

    An import declaration allows a named type or a static member to be referred to by a simple name (§6.2) that consists
        of a single identifier.

    Without the use of an appropriate import declaration, the only way to refer to a type declared in another package,
        or a static member of another type, is to use a fully qualified name (§6.7).

            ImportDeclaration:
                SingleTypeImportDeclaration
                TypeImportOnDemandDeclaration
                SingleStaticImportDeclaration
                StaticImportOnDemandDeclaration

            * A single-type-import declaration (§7.5.1) imports a single named type, by mentioning its canonical name (§6.7).

            * A type-import-on-demand declaration (§7.5.2) imports all the accessible types (§6.6) of a named type or named
                package as needed, by mentioning the canonical name of a type or package.

            * A single-static-import declaration (§7.5.3) imports all accessible static members with a given name from a
                type, by giving its canonical name.

             * A static-import-on-demand declaration (§7.5.4) imports all accessible static members of a named type as
                 needed, by mentioning the canonical name of a type.

    The scope and shadowing of a type or member imported by these declarations is specified in §6.3 and §6.4.

    An import declaration makes types or members available by their simple names only within the compilation unit that
        actually contains the import declaration. The scope of the type(s) or member(s) introduced by an import
        declaration specifically does not include other compilation units in the same package, other import declarations
        in the current compilation unit, or a package declaration in the current compilation unit (except for the annotations
        of a package declaration).

 */

public class Import_Declarations {
}
