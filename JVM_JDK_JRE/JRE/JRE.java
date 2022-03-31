package JVM_JDK_JRE.JRE;

//  https://www.baeldung.com/jvm-vs-jre-vs-jdk#jre


/*                                                   JRE

    Java Runtime Environment (JRE) is a bundle of software components used to run Java applications.

        Core components of the JRE include:

                * An implementation of a Java Virtual Machine (JVM)
                * Classes required to run the Java programs
                * Property Files

        We discussed the JVM in the above section. Here we will focus on the core classes and support files.

                                           1. Bootstrap Classes

    We'll find bootstrap classes under jre/lib/. This path is also known as the bootstrap classpath. It includes:

                * Runtime classes in rt.jar
                * Internationalization classes in i18n.jar
                * Character conversion classes in charsets.jar
                * Others

        Bootstrap ClassLoader loads these classes when the JVM starts up.


                                              2. Extension Classes

    We can find extension classes in jre/lib/extn/ which acts as a directory for extensions to the Java platform. This
        path is also known as extension classpath.

    It contains JavaFX runtime libraries in jfxrt.jar and locale data for java.text and java.util packages in localedata.jar.
        Users can also add custom jars into this directory.

                                                3. Property Settings

    Java platform uses these property settings to maintain its configuration. Depending on their usage they are located
        in different folders inside /jre/lib/. These include:

                * Calendar configurations in the calendar.properties
                * Logging configurations in logging.properties
                * Networking configurations in net.properties
                * Deployment properties in /jre/lib/deploy/
                * Management properties in /jre/lib/management/

                                                  4. Other Files

    Apart from the above-mentioned files and classes, JRE also contains files for other matters:

                * Security management at jre/lib/security
                * The directory for placing support classes for applets at jre/lib/applet
                * Font related files at jre/lib/fonts and others

 */
public class JRE {
}
