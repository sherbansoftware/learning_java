package About_Java.JAR;

// https://docs.oracle.com/javase/tutorial/deployment/jar/basicsindex.html

// https://docs.oracle.com/javase/8/docs/technotes/guides/jar/jarGuide.html


/*                                                    What is JAR?


    ○ JAR stands for Java Archive. It's a file format based on the popular ZIP file format and is used for

                  * aggregating many files into one.

              Although JAR can be used as a

                  * general archiving tool,

                  * the primary motivation for its development was so that Java applets and their requisite components

                        (.class files, images and sounds) can be downloaded to a browser in a single HTTP transaction,
                        rather than opening a new connection for each piece. This greatly improves the speed with which
                        an applet can be loaded onto a web page and begin functioning.

               The JAR format also supports compression, which reduces the size of the file and improves download time
                   still further. Additionally, individual entries in a JAR file may be digitally signed by the applet
                   author to authenticate their origin.


                                                 JAR is:


    ○ the only archive format that is cross-platform

    ○ the only format that handles audio and image files as well as class files

    ○ backward-compatible with existing applet code

    ○ an open standard, fully extendable, and written in java

    ○ the preferred way to bundle the pieces of a java applet

    ○ JAR consists of a zip archive, as defined by PKWARE, containing a manifest file and potentially signature files,
          as defined in the JAR File Specification.

    https://docs.oracle.com/javase/8/docs/technotes/guides/jar/jar.html


 */

public class JAR {
}
