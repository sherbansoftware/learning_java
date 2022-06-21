package Reflection.Method.Getter_Testing;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21454170#overview      3: 00

/*                                    Data Classes


    ○ In data intensive applications we find ourselves maintaining many classes that don't have any real functionality

                   * except for STORING data

           those classes may represent

                    * rows in a relational database

                    * request or responses between services

                    * or any business logic that can be part of an api of some level within our application

       The typical structure of such classes is:

                    *  a large number of private fields

                    * as well as getter

                    * and optional setter methods

            to access and initialize those fields

    ○ A common mistake is to

                     * FORGET to add a getter or a setter

                     * mistype its name

                     * or it's type


    ○ using reflection we're going to implement

                      * a testing framework that given a class with data fields

               will make sure that a proper getter is present to allow access to that data field to other frameworks or
                   library users


 */

public class Getter_Testing {
}
