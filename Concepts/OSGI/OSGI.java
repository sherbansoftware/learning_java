package Concepts.OSGI;

// https://www.baeldung.com/osgi
// https://www.osgi.org/

// https://osgi.github.io/osgi/core/

/*                                                OSGI

    ○ The Open Service Gateway Initiative is a specification defining a Java-based component system.
       It's currently managed by the OSGi Alliance, and its first version dates back to 1999.

    ○ Several

              * Java mission-critical

              * and middleware applications

          have some hard technological requirements.

       Some have to:

              * SUPPORT hot deploy, so as not to disrupt the running services

              * HAVE TO BE ABLE TO WORK WITH DIFFERENT VERSIONS OF THE SAME PACKAGE the same package for the sake of
                    supporting external legacy systems.

    The OSGi platforms represent a viable solution to support this kind of requirements.


                                          WHAT IS OSGI USED FOR?


    ○ The OSGi component system is used to:

                   * build any type of application ranging from the simple to highly complex applications

                         - like IDEs, (Eclipse for example)
                         - application servers,
                         - email systems,
                         - content management systems,
                         - application frameworks,
                         - residential gateways
                         - and onboard telematics systems.


                                                       OSGi BASICS

    ○ In OSGi, a single component is called a bundle.

       Logically, a bundle is a piece of functionality that has an independent lifecycle

           * which means it can be

                     - started,
                     - stopped
                     - and removed independently.

    Technically, a bundle is justA JAR FILE with a MANIFEST.MF file containing some OSGi-specific headers.

    ○ The OSGi platform provides a way to receive notifications about bundles becoming available or when they're removed
          from the platform. This will allow a properly designed client to keep working, maybe with degraded functionality,
          even when a service it depends on, is momentarily unavailable.

      Because of that, a bundle has to:

          explicitly declare what packages it needs to have access to and the OSGi platform will start it only if the
          dependencies are available in the bundle itself or in other bundles already installed in the platform.

 */


public class OSGI {
}
