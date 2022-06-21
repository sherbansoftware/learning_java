package Concepts.Hashing_in_Java;

/*

                                                        Hashing

          Transformation of a string of characters(Text) or another object to a shorted fixed-length value that represent original string.
          A shorter value helps in indexing and faster search.


        In hashing there is a hash function that maps keys to some values.
             But these hashing function may lead to collision that is two or more keys are mapped to same value.
             Chain hashing avoids collision. The idea is to make each cell of hash table point to a linked list of records
             that have same hash function value.


        HashCode is used in storing values into HashMap.
        HashMap has table -an array of nodes

        Npde<K,V>[] table

        int hash
        K key
        V value
        Node<K,V> next;    the node is a linked list
        Default HashMap comes with a table of size 16

                                                         NOTE

            * in Java  hashCode() is actually Hash Function which generate a unique code for the object.(numerical representation
                  for that object)

            * are a lot of different hash functions
            * a hash function must accept 3 basic rules:

                  1. calling of hash function on tje same input should always produce the same output
                  2. hash function has to be fast
                  3. hash function result must be pretty random to not distribute all entries to same bucket
                     or a small number of buckets

            * two different objects that may generate same hashCode, but if both are equal according to this equals method,
                  then the hash code must be same.
               To maintain this contract all the time, it is recommended that you override both the methods together

            * if you override equals method and you don't override hasCode method, then two equal objects according to
               the equals method will have different hashcode.

            * This breaks this contract between equals and the hashcode.
            * in case you're using it on implementation or you are overriding this hashCode, you must use the values that
                  are unique to you, to your object.





 */


public class Hashing_In_Java {
    public static void main(String[] args) {


        if (new String("FB") == new String("Ea")) {

            System.out.println("They have same hashCode: " + new String("FB").hashCode() + " " + new String("Ea").hashCode());

        }

        Object o = new Object();

            System.out.println(o.equals(new Object()));  //false

            System.out.println(new String().equals(new  String()));  //true


    }
}
