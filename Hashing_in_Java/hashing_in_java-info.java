package Hashing_in_Java;
/*

                                                        Hashing

          Transformation of a string of characters(Text) to a shorted fixed-length value that represent original string.
          ATest.A shorter value helps in indexing and faster search.


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

 */