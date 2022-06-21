package JNDI;


// https://www.baeldung.com/jndi

// https://docs.oracle.com/javase/tutorial/jndi/overview/index.html#:~:text=The%20Java%20Naming%20and%20Directory,any%20specific%20directory%20service%20implementation.

// https://docs.oracle.com/javase/8/docs/technotes/guides/jndi/index.html


/*                                           The Java Naming and Directory Interface™ (JNDI)


    ○ is an application programming interface (API) that provides:

                   * naming and directory functionality to applications

                written using the Java™ programming language. It is defined to be independent of any
                specific directory service implementation.

                                                       NOTE

             * If a DB connection is created every time user connects to DB and closed later it results in a lot of time
                   getting wasted in creating connection object itself to perform a database transaction that might take
                   few milliseconds. Rather than opening a connection per user it is much more efficient to create a pool
                   of connections that is shared among the users.
               User can retrieve an idle connection object from the connection pool whenever user has to connect to DB
                   and once done connection is returned to the pool to be used by another user. You can also impose an upper
                   limit to the number of connections in the pool, in that case if the maximum open connection limit for
                   the pool has been reached any further requests for the connection are queued to get the connection
                   when it is released by other user.

 */


public class JNDI {
}