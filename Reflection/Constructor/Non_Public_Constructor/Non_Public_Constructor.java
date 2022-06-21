package Reflection.Constructor.Non_Public_Constructor;

//  https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21271158#questions/15936422

/*                                           Non-Public Constructor

    ○  Private constructors CANNOT BE CALLED from outside the class
       If we try to call it from outside the class we would

                   * get a compilation error

    ○  Using Reflection we have

                   * full access to all

                             - public

                             - protected

                             - packaged private

                             - and private constructors

             not only do we have access to those constructors.

    ○ Using Constructor.newInstance() method we can easily

                   * create object of a class using one of those restricted constructors.

    ○ Exception:

                  * a class belonging to a java module that explicitly does not allow access to that particular class.

    ○ One use case for this feature is the creation of

                  * an immutable object of a class

          that can still be accessible to everyone but can only be created by our library or framework that uses
              reflection to instantiate it.

    ○ The only modification we need to make when instantiating an otherwise inaccessible constructor of a class is to

                  * make the constructor accessible explicitly by setting the accessible property to true

                            - constructor.setAccessible(true);

 */

public class Non_Public_Constructor {
}
