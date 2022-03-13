package Java.Algorithms_in_Java.Insertion_Sort;

// https://www.programiz.com/dsa/insertion-sort

/*                                             Insertion Sort Algorithm

    Insertion sort works similarly as we sort cards in our hand in a card game.We assume that the first card is already
    sorted then, we select an unsorted card. If the unsorted card is greater than the card in hand, it is placed on
    the right otherwise, to the left. In the same way, other unsorted cards are taken and put at their right place.

    ATest.A similar approach is used by insertion sort.

    Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

    Insertion Sort Algorithm
        insertionSort(array)
        mark first element as sorted
       for each unsorted element X
           'extract' the element X
           for j <- lastSortedIndex down to 0
           if current element j > X
           move sorted element to the right by 1
          break loop and insert X here
    end insertionSort

    Time Complexities: -------------------------------------------------------------------------------------------------

    Worst Case Complexity: O(n2)

        Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case
        complexity occurs.
        Each element has to be compared with each of the other elements so, for every nth element,
        (n-1) number of comparisons are made.
        Thus, the total number of comparisons = n*(n-1) ~ n2

    Best Case Complexity: O(n)

        When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run
        at all.So, there are only n number of comparisons. Thus, complexity is linear.

    Average Case Complexity: O(n2)

        It occurs when the elements of an array are in jumbled order (neither ascending nor descending).

    Space Complexity ---------------------------------------------------------------------------------------------------

        Space complexity is O(1) because an extra variable key is used.

    Insertion Sort Applications
    The insertion sort is used when:

        �the array is has a small number of elements
        �there are only a few elements left to be sorted


*/