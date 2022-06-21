package Collection.miscelanous.Interfaces.List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);


//--------------------------------------- Positional access ------------------------------------------------------------

        //E get(int index)---------------------------------------------------------------------------------------------

//        Theatre.Seat position = theatre.seats.get(5);
//        System.out.println(position.getSeatNumber());

        //public E set(E element)----------------------------------------------------------------------------

//        theatre.seats.set(0, theatre.new Seat("A99"));
//        System.out.println(theatre.seats);

        //boolean add(lang.classes.Object obj)------------------------------------------------------------------------

//         boolean added = theatre.seats.add(theatre.new Seat("L44"));
//         System.out.println(added);

        //void add(int index, E e)--------------------------------------------------------------------------------------

//        theatre.seats.add(0, theatre.new Seat("L44"));
//        System.out.println(theatre.seats.get(0).getSeatNumber());

        //boolean addAll(Collection c)----------------------------------------------------------------------------------

        //This method appends all of the elements in the specified collection to the end of this list,
        // in the order that they are returned by the specified collection�s iterator.

        //E remove(int index)-------------------------------------------------------------------------------------------

//        Theatre.Seat seatRemoved =   theatre.seats.remove(0);
//        System.out.println(seatRemoved.getSeatNumber());
//        printList(theatre.seats);
//        System.out.println(theatre.seats.size());

//--------------------------------------- Search -----------------------------------------------------------------------

        // public int indexOf(lang.classes.Object o)--------------------------------------------------------------------------------

//        return -1 if object isn't found
//        int ind = theatre.seats.indexOf(theatre.seats.get(5));
//        System.out.println(theatre.seats.get(ind).getSeatNumber());

        //int lastIndexOf(lang.classes.Object o)------------------------------------------------------------------------------------

//        return -1 if object isn't found
//        theatre.seats.set(8,theatre.seats.get(5));
//        int lastIndex = theatre.seats.lastIndexOf(theatre.seats.get(5));
//        printList(theatre.seats);
//        System.out.println(lastIndex);

//------------------------------------------Iteration------------------------------------------------------------------

        // create list
        List<String> crucifyList = new ArrayList<String>();

        // add 4 different values to list
        crucifyList.add("Facebook");
        crucifyList.add("Paypal");
        crucifyList.add("Google");
        crucifyList.add("Yahoo");
        crucifyList.add("Amazon");
        crucifyList.add("Paypal");
        crucifyList.add("Tesla");
        crucifyList.add("Apple");

//        // Other way to define list is - we will not use this list :)
//        List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

//
//        // Simple For loop---------------------------------------------------------------------------------------------
//        System.out.println("==============> 1. Simple For loop Example.");
//        for (int i = 0; i < crucifyList.size(); i++) {
//            System.out.println(crucifyList.get(i));
//        }
//
//        // New Enhanced For loop----------------------------------------------------------------------------------------
//        System.out.println("\n==============> 2. New Enhanced For loop Example..");
//        for (String temp : crucifyList) {
//            System.out.println(temp);
//        }
//
//        // Iterator_Interface - Returns an iterator over the elements in this list in proper sequence.----------------------------
//        System.out.println("\n==============> 3. Iterator_Interface Example...");
//        Iterator_Interface<String> crunchifyIterator = crucifyList.iterator();
//        while (crunchifyIterator.hasNext()) {
//            System.out.println(crunchifyIterator.next());
//        }
//
//        // ListIteratorDemo - traverse a list of elements in either forward or backward order-------------------------------
//        // An iterator for lists that allows the programmer to traverse the list in either direction,
//        // modify the list during iteration,
//        // and obtain the iterator's current position in the list.
//        System.out.println("\n==============> 4. ListIteratorDemo Example...");
//        ListIteratorDemo<String> crunchifyListIterator = crucifyList.listIterator();
//        while (crunchifyListIterator.hasNext()) {
//            System.out.println(crunchifyListIterator.next());
//        }
//
//        // while loop---------------------------------------------------------------------------------------------------
//        System.out.println("\n==============> 5. While Loop Example....");
//        int i = 0;
//        while (i < crucifyList.size()) {
//            System.out.println(crucifyList.get(i));
//            i++;
//        }
//
//        // Iterable.forEach() util: Returns a sequential Stream with this collection as its source----------------------
//        System.out.println("\n==============> 6. Iterable.forEach() Example....");
//        crucifyList.forEach((temp) -> {
//            System.out.println(temp);
//        });
//
//        // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source-------------
//        System.out.println("\n==============> 7. Stream.forEach() Example....");
//        crucifyList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));


//-----------------------------------Range-view-------------------------------------------------------------------------

        // printList(crucifyList);
        //clear list in a range------------------------------------------------------------------------------------------
//        crucifyList.subList(2, crucifyList.size()).clear();
//        List<String> rl = new ArrayList_<>(crucifyList);
//        printList(rl);
//        System.out.println(rl.size());

//        Search for an element in a range-----------------------------------------------------------------------------

//        int i = crucifyList.subList(2, crucifyList.size()).indexOf("Googlef");
//        if(i>=0) {
//            System.out.println("Google found");
//        } else {
//            System.out.println("Element not found");
//        }

//        Search for last element occurence in a range------------------------------------------------------------------

//        int i = crucifyList.subList(2, crucifyList.size()).lastIndexOf("Paypal");
//        if (i >= 0) {
//            System.out.println("Paypal found at range " + i);
//        } else {
//            System.out.println("Element not found");
//        }

//----------------------------------- List Algorithms-------------------------------------------------------------------

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);

        // public static void shuffle(List<?> list)---------------------------------------------------------------------

//       Collections_.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);

        // public static void sort list---------------------------------------------------------------------------------

//        Collections_.shuffle(seatCopy);
//        printList(seatCopy);
//        Collections_.sort(seatCopy);
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//        printList(seatCopy);

        // public static void reverse(List<?> list)---------------------------------------------------------------------

//        Collections_.reverse(seatCopy);
//        printList(seatCopy);

        // min element list---------------------------------------------------------------------------------------------

//        Theatre.Seat minSeat = Collections_.min(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());

        // max element list---------------------------------------------------------------------------------------------

//        Theatre.Seat maxSeat = Collections_.max(seatCopy);
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        // public static void rotate(List<?> list, int distance)--------------------------------------------------------
//          printList(crucifyList);
//          Collections_.rotate(crucifyList, 1);
//          printList(crucifyList);

        //public static <T> boolean replaceAll---------------------------------------------------------------------------

//        printList(crucifyList);
//        boolean replaced = Collections_.replaceAll(crucifyList, "Paypal", "SpaceX");
//        if (replaced) {
//            System.out.println("Paypal was replaced");
//            printList(crucifyList);
//        } else {
//            System.out.println("Replaced wasn't take palced");
//        }

        // public static <T> void fill(List<? super T> list, T obj)-----------------------------------------------------

//         Collections_.fill(crucifyList, "ZUZA");
//          printList(crucifyList);



//        List<Theatre.Seat> newList = new ArrayList_<>(theatre.seats.size());
//        Collections_.copy(newList, theatre.seats);


//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already reserved");
//        }


    }

    public static void printList(List<?> list) {
        for (Object seat : list) {
            System.out.print(" " + seat.toString());
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
