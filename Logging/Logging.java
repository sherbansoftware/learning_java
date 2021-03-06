package Logging;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/package-summary.html


/*                                                   java.util.logging


    ○ Provides the classes and interfaces of the Java™ 2 platform's core logging facilities.

    ○ The central goal of the logging APIs is to

                  * support maintaining and servicing software at customer sites.


                                            There are four main target uses of the logs:


    ○ Problem diagnosis by end users and system administrators.

                  * This consists of simple logging of common problems that can be fixed or tracked locally, such as

                                - running out of resources,

                                - security failures,

                                - and simple configuration errors.

    ○ Problem diagnosis by field service engineers.

                  * The logging information used by field service engineers may be considerably more complex and verbose
                         than that required by system administrators. Typically such information will require extra logging
                         within particular subsystems.

    ○ Problem diagnosis by the development organization.

                  * When a problem occurs in the field, it may be necessary to

                                - return the captured logging information to the original development team for diagnosis.

                        This logging information may be extremely detailed and fairly inscrutable. Such information might
                            include detailed tracing on the internal execution of particular subsystems.

    ○ Problem diagnosis by developers.

                  * The Logging APIs may also be used to help debug an application under development. This may include

                                - logging information generated by the target application

                                - as well as logging information generated by lower-level libraries.

                  * Note however that while this use is perfectly reasonable, the logging APIs

                                - are not intended to replace the

                                              • normal debugging and profiling tools

                                      that may already exist in the development environment.

 */

public class Logging {
}
