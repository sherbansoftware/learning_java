package JVM_JDK_JRE.JDK;

// https://www.baeldung.com/jvm-vs-jre-vs-jdk#jdk

/*                                                     JDK

    Java Development Kit (JDK) provides environment and tools for

            * developing,
            * compiling,
            * debugging,
            * and executing

        a Java program.

    Core components of JDK include:

            * JRE
            * Development Tools

                                                Development tools

                                                1. Basic Tools

           These tools lay the foundation of the JDK and are used to create and build Java applications. Among these tools,
               we can find utilities for

                   * compiling,
                   * debugging,
                   * archiving,
                   * generating Javadocs, etc.

    They include:

                   * javac

                         – reads class and interface definitions and compiles them into class files

                   * java

                         – launches the Java application

                   * javadoc

                         – generates HTML pages of API documentation from Java source files

                   * apt
                         – finds and executes annotation processors based on the annotations present in the set of
                               specified source files

                   * appletviewer

                         – enables us to run Java applets without a web browser

                   * jar

                         – packages Java applets or applications into a single archive

                    * jdb

                         – a command-line debugging tool used to find and fix bugs in Java applications

                    * javah

                         – produces C header and source files from a Java class

                    * javap

                         – disassembles the class files and displays information about fields, constructors, and methods
                               present in a class file
                    * extcheck

                          – detects version conflicts between target Java Archive (JAR) file and currently installed
                               extension JAR files

                                                  2.  Security Tools

    These include key and certificate management tools that are used to manipulate Java Keystores.
    A Java Keystore is a

            container for authorization certificates or public key certificates.

        Consequently, it is often used by Java-based applications for encryption, authentication, and serving over HTTPS.

    Also, they help to set the security policies on our system and create applications which can work within the scope of
        these policies in the production environment. These include:

                * keytool
                      – helps in managing keystore entries, namely, cryptographic keys and certificates

                * jarsigner
                      – generates digitally signed JAR files by using keystore information

                * policytool
                       –  enables us to manage the external policy configuration files that define installation's security
                              policy

        Some security tools also help in managing Kerberos tickets.

    Kerberos is a network authentication protocol.

    It works on the basis of tickets to allow nodes communicating over a non-secure network to prove their identity to
        one another in a secure manner:

                * kinit
                      – used to obtain and cache Kerberos ticket-granting tickets
                * ktab
                      – manages principle names and key pairs in the key table

                * klist
                      – displays entries in the local credentials cache and key table

                                               3. Internationalization Tool

    Internationalization is the process of designing an application so that it can be adapted to various languages and
        regions without engineering changes.
    For this purpose, the JDK brings native2ascii. This tool converts a file with characters supported by JRE to files
        encoded in ASCII or Unicode escapes.

                                              4. Remote Method Invocation (RMI) Tools

    RMI tools enable remote communication between Java applications thus providing scope for development of distributed
        applications.

    RMI enables an object running in one JVM to invoke methods on an object running in another JVM.
        These tools include:

                * rmic
                      – generates stub, skeleton, and tie classes for remote objects using the Java Remote Method Protocol
                            (JRMP) or Internet Inter-Orb Protocol (IIOP)

                * rmiregistry
                      – creates and starts remote object registry

                * rmid
                      – starts the activation system daemon. This allows objects to be registered and activated in a Java
                        Virtual Machine

                * serialver
                      – returns serial version UID for specified classes

                                               5. Java IDL and RMI-IIOP Tools

    Java Interface Definition Language (IDL) adds Common Object-Based Request Broker Architecture (CORBA) capability
        to the Java platform.

    These tools enable distributed Java web applications to invoke operations on remote network services using industry
        standard Object Management Group (OMG) – IDL.
    Likewise, we could use Internet InterORB Protocol (IIOP).
    RMI-IIOP, i.e. RMI over IIOP enables programming of CORBA servers and applications via the RMI API. Thus enabling
        connection between two applications written in any CORBA-compliant language via Internet InterORB Protocol (IIOP).


    These tools include:

                * tnameserv
                      – transient Naming Service which provides a tree-structured directory for object references

                * idlj
                      – the IDL-to-Java Compiler for generating the Java bindings for a specified IDL file

                * orbd
                       – enable clients to transparently locate and invoke persistent objects on the server in CORBA
                              environment

                * servertool
                       – provides command-line interface to register or unregister a persistent server with ORB Daemon
                             (orbd), start and shut down a persistent server registered with ORB Daemon, etcetera

                                                  6. Java Deployment Tools

    These tools help in deploying Java applications and applets on the web.
        They include:

                * pack200
                      – transforms a JAR file into a pack200 file using the Java gzip compressor
                * unpack200
                       – transforms pack200 file into a JAR file

                                                   7. Java Plug-in Tool

    JDK provides us with htmlconverter. Furthermore, it's used in conjunction with the Java Plug-in.
    On the one hand, Java Plug-in establishes a connection between popular browsers and the Java platform. As a result
        of this connection, applets on the website can run within a browser.
    On the other hand, htmlconverter is a utility for converting an HTML page containing applets to a format for Java
        Plug-in.

                                                    8. Java Web Start Tool

    JDK brings javaws. We can use it in conjunction with the Java Web Start.
    This tool allows us to download and launch Java applications with a single click from the browser. Hence, there is
        no need to run any installation process.

                                                   9. Monitoring and Management Tools

    These are great tools that we can use to monitor JVM performance and resource consumption. Here are a few of these: :

                * jconsole
                      – provides a graphical console that lets you monitor and manage Java applications

                * jps
                      – lists the instrumented JVMs on the target system

                * jstat
                      – monitors JVM statistics

                jstatd
                      – monitors creation and termination of instrumented JVMs

                                            10. Troubleshooting Tools

    These are experimental tools that we can leverage for troubleshooting tasks:

                * info
                      – generates configuration information for a specified Java process

                * jmap – prints shared object memory maps or heap memory details of a specified process
                * jsadebugd – attaches to a Java process and acts as a debug server
                * jstack – prints Java stack traces of Java threads for a given Java process

 */

public class JDK {
}
