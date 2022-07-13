package JUnit;

// https://www.udemy.com/course/spring-boot-tutorial-for-beginners/learn/lecture/32905530#questions

// https://junit.org/junit5/

// https://junit.org/junit5/docs/current/user-guide/

/*                                                JUnit


    ○ Testing

                   * We check the behaviour of the app against the expected behaviour.


                                                 Types of testing


    1. System testing or Integration testing.

                   * Deploy the complete application and nd have your testing team test that..


    2 Unit Testing

                   * test specific units of application code independently.

           For example,

                   * a specific method

                   * or a group of methods.

                   * entire class


                                            Advantage of Unit Test


    1 You can find bugs early(run under CI).  --------------------------------------------------------------------------

        ○ If you have Unit Tests for all your methods, you can run this in Continuous Integration.

                   * When somebody commits your code to Git or any other version control,

                   * you can have a build which runs all the unit tests.

            And if any of the unit tests fails,

                   * you will get an email and thereby you can find bugs very, very early.


    2. The other advantage is that it's easy to fix bugs. --------------------------------------------------------------

       ○ If you have a bug which is reported from System Testing or Integration Testing,

                   * you need to find out which method is causing that error.

           From the thousands of methods that you have in your application,

                    * you need to find out which method is having the bug,

        ○ But when it comes to Unit Testing,

                    * when a Unit Test for a specific method fails,

                    * you know that the problem is with that SPECIFIC METHOD.

    3. Reduced costs on the long run  ----------------------------------------------------------------------------------

         ○ Writing unit tests at the start

                    * might take a lot of time.

                    * and it involves a lot of costs.

          ○ But in the long run,

                    * when you consider the complete maintenance of the application,

                    * you'd see that having great Unit Tests reduces costs.


                           When it comes to Java, the most popular unit testing frameworks are


    ○ JUnit

                    * is a Unit Testing Framework

    ○ Mockito

                     * is a mocking framework.


                                                            NOTE


    ○ Typically, applications have both option one and option two as well.

    ○ So you would have

                    * System Tests, Integration Tests

                    * and Unit Tests as well.


    ○ Unit framework

                    * does not guarantee the execution in the same order you have in compilation unit.

    ○ So if you have

                    * any setup to be done BEFORE running a test,

                                  - you can do that in the @BeforeEach  methods.


    ○  If there is

                    * any cleanup that you'd want to do after each test,

                    * that's what you would be doing in the @AfterEach methods.

 */

public class JUnit_ {
}
