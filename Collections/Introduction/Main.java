package Collections.Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*                                        Collection

   ATest.A collection � sometimes called a container � is simply an object that groups multiple elements into a single unit.
   Collections_ are used to store, retrieve, manipulate, and communicate aggregate data

                                          Collections_ Framework

   ATest.A collections framework is a unified architecture for representing and manipulating collections.

                                          Collections_ Framework Contains
   Interface_Class:
     These are abstract data types that represent collections. Interface_Class allow collections to be manipulated independently of the details of their representation. In object-oriented languages, interfaces generally form a hierarchy.
   Implementations:
     These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.
   Algorithms:
     These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces.
     The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface. In essence, algorithms are reusable functionality.

                                          Benefits of the Java Collections_ Framework

   Reduces programming effort:
      By providing useful data structures and algorithms, the Collections_ Framework frees you to concentrate on the important
      parts of your program rather than on the low-level "plumbing" required to make it work. By facilitating interoperability
      among unrelated APIs, the Java Collections_ Framework frees you from writing adapter objects or conversion code to connect APIs.
   Increases program speed and quality:
      This Collections_ Framework provides high-performance, high-quality implementations of useful data structures and algorithms.
      The various implementations of each interface are interchangeable, so programs can be easily tuned by switching collection
      implementations. Because you're freed from the drudgery of writing your own data structures, you'll have more time to devote
      to improving programs' quality and performance.
   Allows interoperability among unrelated APIs:
      The collection interfaces are the vernacular by which APIs pass collections back and forth. If my network administration API
      furnishes a collection of node names and if your GUI toolkit expects a collection of column headings, our APIs will interoperate
      seamlessly, even though they were written independently.
  Reduces effort to learn and to use new APIs:
      Many APIs naturally take collections on input and furnish them as output. In the past, each such API had a small sub-API
      devoted to manipulating its collections. There was little consistency among these ad hoc collections sub-APIs, so you had to
      learn each one from scratch, and it was easy to make mistakes when using them. With the advent of standard collection interfaces,
      the problem went away.
  Reduces effort to design new APIs:
      This is the flip side of the previous advantage. Designers and implementers don't have to reinvent the wheel each time they create
      an API that relies on collections; instead, they can use standard collection interfaces.
  Fosters software reuse:
      New data structures that conform to the standard collection interfaces are by nature reusable.
      The same goes for new algorithms that operate on objects that implement these interfaces.

 */
public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already taken");
        }
        //reverse order
        Collections.reverse(seatCopy);
        System.out.println("reversed seatCopy");
        printList(seatCopy);

        //shuffle order
        Collections.shuffle(seatCopy);
        System.out.println("shuffle seatCopy");
        printList(seatCopy);

        System.out.println("Printing normal theatre.seats");
        printList(theatre.seats);
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
        // sort list
        //Collections_.sort(seatCopy);

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        List<Theatre.Seat> newList = new ArrayList_<>(theatre.seats.size());
//        Collections_.copy(newList, theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

}

