package Packages.Package_Members;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.2

/*                                                              Package Members

    The members of a package are:

             * its subpackages
             * and all the top level class types (§7.6, §8 (Classes))
             * and top level interface types (§9 (Interfaces))

         declared in all the compilation units (§7.3) of the package.

    For example, in the Java SE platform API:

        The package java has subpackages awt, applet, io, lang, net, and util, but no compilation units.

        The package java.awt has a subpackage named image, as well as a number of compilation units containing declarations
            of class and interface types.

    If the fully qualified name (§6.7) of a package is P, and Q is a subpackage of P, then P.Q is the fully qualified name
        of the subpackage, and furthermore denotes a package.

    A package may not contain two members of the same name, or a compile-time error results.

    Here are some examples:

            * Because the package java.awt has a subpackage image, it cannot (and does not) contain a declaration of a
                class or interface type named image.

            * If there is a package named mouse and a member type Button in that package (which then might be referred to
                as mouse.Button), then there cannot be any package with the fully qualified name mouse.Button or mouse.
                Button.Click.

             * If com.nighthacks.java.jag is the fully qualified name of a type, then there cannot be any package whose
                 fully qualified name is either com.nighthacks.java.jag or com.nighthacks.java.jag.scrabble.

    It is however possible for members of different packages to have the same simple name. For example, it is possible
        to declare a package:


            package vector;
            public class Vector { Object[] vec; }

    that has as a member a public class named Vector, even though the package java.util also declares a class named Vector.
        These two class types are different, reflected by the fact that they have different fully qualified names (§6.7).
        The fully qualified name of this example Vector is vector.Vector, whereas java.util.Vector is the fully qualified
        name of the Vector class included in the Java SE platform. Because the package vector contains a class named
        Vector, it cannot also have a subpackage named Vector.

    The hierarchical naming structure for packages is intended to be convenient for organizing related packages in a
        conventional manner, but has no significance in itself other than the prohibition against a package having a
        subpackage with the same simple name as a top level type (§7.6) declared in that package.

    For example, there is no special access relationship between a package named oliver and another package named
        oliver.twist, or between packages named evelyn.wood and evelyn.waugh. That is, the code in a package named
        oliver.twist has no better access to the types declared within package oliver than code in any other package.

 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Package_Members extends Frame {
    public Package_Members(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by tim Buchalka", 60, 100);
    }

// =================================================================================================================

    public static void main(String[] args) {

        Package_Members myWindow = new Package_Members("Complete Java ");
        myWindow.setVisible(true);


    }


}
