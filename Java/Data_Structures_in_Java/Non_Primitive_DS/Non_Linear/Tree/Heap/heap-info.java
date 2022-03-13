package Java.Data_Structures_in_Java.Non_Primitive_DS.Non_Linear.Tree.Heap;

// https://www.geeksforgeeks.org/heap-data-structure/

/*                                                       ATest.A Heap

    is a special Tree-based data structure in which the tree is a complete binary tree.

    Generally, Heaps can be of two types:

        1.Max-Heap:
            In a Max-Heap the key present at the root node must be greatest among the keys present at all of it�s children.
            The same property must be recursively true for all sub-trees in that Binary Tree.
        2.Min-Heap:
            In a Min-Heap the key present at the root node must be minimum among the keys present at all of it�s children.
            The same property must be recursively true for all sub-trees in that Binary Tree.

  https://www.geeksforgeeks.org/heap-data-structure/

    Binary Heap
    Time Complexity of building a heap
    Applications of Heap Data Structure
    Binomial Heap
    Fibonacci Heap
    Leftist Heap
    K-ary Heap
    Heap Sort
    Iterative Heap Sort
    K�th Largest Element in an array
    K�th Smallest/Largest Element in Unsorted Array | Set 1
    Sort an almost sorted array/
    Tournament Tree (Winner Tree) and Binary Heap
    Check if a given Binary Tree is Heap
    How to check if a given array represents a Binary Heap?
    Connect n ropes with minimum cost
    Design an efficient data structure for given operations
    Merge k sorted arrays | Set 1
    Merge Sort Tree for Range Order Statistics
    Sort numbers stored on different machines
    Smallest Derangement of Sequence
    Largest Derangement of a Sequence
    K maximum sum combinations from two arrays
    Maximum distinct elements after removing k elements
    Maximum difference between two subsets of m elements
    Height of a complete binary tree (or Heap) with N nodes
    Heap Sort for decreasing order using min heap
    Print all nodes less than a value x in a Min Heap.
    Median of Stream of Running Integers using STL
    Largest triplet product in a stream
    Find k numbers with most occurrences in the given array
    Convert BST to Min Heap
    Merge two binary Max Heaps
    K-th Largest Sum Contiguous Subarray
    Minimum product of k integers in an array of positive Integers
    Leaf starting point in a Binary Heap data structure
    Why is Binary Heap Preferred over BST for Priority Queue?
    Convert min Heap to max Heap
    Given level order traversal of a Binary Tree, check if the Tree is a Min-Heap
    Rearrange characters in a string such that no two adjacent are same
    Implementation of Binomial Heap
    Array Representation Of Binary Heap
    Sum of all elements between k1�th and k2�th smallest elements
    Minimum sum of two numbers formed from digits of an array
    K�th largest element in a stream
    k largest(or smallest) elements in an array | added Min Heap method
    Median in a stream of integers (running integers)
    Sort a nearly sorted (or K sorted) array






    Applications of Heap Data Structure:

        Priority Queues:
            Priority queues can be efficiently implemented using Binary Heap because it supports insert(), delete() and
            extractmax(), decreaseKey() operations in O(log N) time. Binomoial Heap and Fibonacci Heap are variations of
            Binary Heap. These variations perform union also in O(logn) time which is a O(n) operation in Binary Heap

       Order statistics:
           The Heap data structure can be used to efficiently find the kth smallest (or largest) element in an array.
           See method 4 and 6 of this post for details.

*/