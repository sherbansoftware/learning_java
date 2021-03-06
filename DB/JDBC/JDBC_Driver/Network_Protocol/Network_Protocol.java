package DB.JDBC.JDBC_Driver.Network_Protocol;

// https://www.javatpoint.com/jdbc-driver

/*                                                      Network Protocol driver

    ? The Network Protocol driver uses middleware (application server) that

                   * converts JDBC calls directly or indirectly into the vendor-specific database protocol.

               It is fully written in java.

                                                           Advantage:


    ? No client side library is required because of application server that can perform many tasks like

                  * auditing,
                  * load balancing,
                  * logging etc.


                                                          Disadvantages:


    ? Network support is required on client machine.

    ? Requires database-specific coding to be done in the middle tier.

    ? Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in
          the middle tier.

 */

public class Network_Protocol {
}
