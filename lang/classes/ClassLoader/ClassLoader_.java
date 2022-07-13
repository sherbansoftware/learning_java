package lang.classes.ClassLoader;

// https://www.baeldung.com/java-classloaders

//  https://examples.javacodegeeks.com/java-classloader-example/

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html



/*                                Module java.base
                                    Package java.lang
                                    Class ClassLoader


                     public abstract class ClassLoader extends Object


                                   What is the role for a ClassLoader in Java?
               
               
        ○   Three Class	Loaders	are	shown in the picture

                         * System Class	Loader

                                       - Loads all classes from	CLASSPATH

                                             • the classes that you write as a programmer and are in the CLASSPATH

                          * Extension Class	Loader

                                         - Loads all classes from extension	directory

                                             • second ones are the classes that are in the frameworks(Spring, Struts etc.)
                                                   that you use.(jre,ext,lib)

                          * Bootstrap Class	Loader

                                          - Loads all the Java Core	files

                                              • classes with the Java environment directly provide(jar, ear, war)

        ○ A class loader is an object that is responsible for loading classes.
                  The class ClassLoader is an abstract class.
                  Given the binary name of a class, a class loader should attempt to locate or generate data that
                      constitutes a definition for the class.

        ○ A typical strategy is to transform the name into a file name and then read a "class file" of that
                  name from a file system.
            Every Class object contains a reference to the ClassLoader that defined it.

        ○ Class objects for array classes are not created by class loaders,

                                  * but are created automatically as required by the Java runtime.

            The class loader for an array class, as returned by Class.getClassLoader() is the same as the class
                    loader for its element type;

                                  * if the element type is a primitive type, then the array class has no class loader.

        ○ Applications implement subclasses of ClassLoader in order to extend the manner in which the Java virtual machine
                    dynamically loads classes.

        9 Class loaders may typically be used by security managers to indicate security domains.

        ○ The ClassLoader class uses a delegation model to search for classes and resources. Each instance of ClassLoader has
                    an associated parent class loader. When requested to find a class or resource, a ClassLoader instance will
                    delegate the search for the class or resource to its parent class loader before attempting to find the
                    class or resource itself.

        ○ The virtual machine's built-in class loader,

                                     * called the "bootstrap class loader",

                       does not itself have a parent but may serve as the parent of a ClassLoader instance.

        ○ Class loaders that support concurrent loading of classes are known as parallel capable class loaders and are required
                  to register themselves at their class initialization time by invoking the ClassLoader.registerAsParallelCapable
                  method. Note that the ClassLoader class is registered as parallel capable by default. However, its subclasses
                  still need to register themselves if they are parallel capable.
        ○ In environments in which the delegation model is not strictly hierarchical, class loaders need to be parallel capable,
                otherwise class loading can lead to deadlocks because the loader lock is held for the duration of the class loading
                process (see loadClass methods).

        ○ Normally, the Java virtual machine loads classes

                                  * from the local file system in a platform-dependent manner.

        ○ For example, on UNIX systems, the virtual machine loads classes from the

                                  * directory defined by the CLASSPATH environment variable.

        ○ However, some classes may not originate from a file;

                                  * they may originate from other sources, such as

                                                             - the network,

                                                             - or they could be constructed by an application.

                    The method defineClass converts

                                    * an array of bytes into an instance of class Class.

                      Instances of this newly defined class can be created using Class.newInstance.

        ○ The methods and constructors of objects created by a class loader may reference other classes.

           To determine the    class(es) referred to, the Java virtual machine invokes the loadClass method of the class
                  loader that originally created the class.

        ○ For example, an application could create a network class loader to download class files from a server.

            Sample code
                    might look like:

     ClassLoader loader = new NetworkClassLoader(host, port);
     lang.classes.Object main = loader.loadClass("Interface_Class", true).newInstance();
               . . .

        ○ The network class loader subclass must define the methods findClass and loadClassData to load a class from the network.
                  Once it has downloaded the bytes that make up the class, it should use the method defineClass to create a class
                  instance. A sample implementation is:

                           class NetworkClassLoader extends ClassLoader {
                                  String host;
                                  int port;

                             public Class findClass(String name) {
                                  byte[] b = loadClassData(name);
                                  return defineClass(name, b, 0, b.length);
                             }

                         private byte[] loadClassData(String name) {
                       // load the class data from the connection
                         . . .
                             }
                         }


                                                                                                             Binary names


        ○ https://docs.oracle.com/javase/specs/jls/se11/html/jls-13.html#jls-13.1

        ○ Any class name provided as a String parameter to methods in ClassLoader must be a binary name as defined by
                      The Java™ Language Specification.

        ○ Examples of valid class names include:

                                  * "java.lang.String"

                                  * "javax.swing.JSpinner$DefaultEditor"

                                  * "java.security.KeyStore$Builder$FileBuilder$1"

                                  * "java.net.URLClassLoader$3$1"

        Since:
               1.0

        See Also:
        resolveClass(Class)

 */


class ClassLoader_ {
        ClassLoader classLoader;
}