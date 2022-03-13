package Java.Algorithms_in_Java.Bucket_Sort;

// https://www.programiz.com/dsa/bucket-sort

/*                                                   Bucket Sort

    is a sorting technique that sorts the elements by first dividing the elements into several groups called buckets.
    The elements inside each bucket are sorted using any of the suitable sorting algorithms or recursively calling the
    same algorithm.
    Several buckets are created. Each bucket is filled with a specific range of elements. The elements inside the bucket
    are sorted using any other algorithm. Finally, the elements of the bucket are gathered to get the sorted array.
    The process of bucket sort can be understood as a scatter-gather approach.
    The elements are first scattered into buckets then the elements of buckets are sorted. Finally, the elements are
    gathered in order.

        bucketSort()
            create N buckets each of which can hold a range of valuesfor all the buckets
            initialize each bucket with 0 values
            for all the buckets put elements into buckets matching the range
            for all the buckets sort elements in each bucket
            gather elements from each bucket
       end bucketSort

                                                      Complexity

    Worst Case Complexity: O(n2)

        When there are elements of close range in the array, they are likely to be placed in the same bucket. This may
        result in some buckets having more number of elements than others.
        It makes the complexity depend on the sorting algorithm used to sort the elements of the bucket.
        The complexity becomes even worse when the elements are in reverse order. If insertion sort is used to sort
        elements of the bucket, then the time complexity becomes O(n2).

    Best Case Complexity: O(n+k)

        It occurs when the elements are uniformly distributed in the buckets with a nearly equal number of elements i
        n each bucket.The complexity becomes even better if the elements inside the buckets are already sorted.
        If insertion sort is used to sort elements of a bucket then the overall complexity in the best case will be
        linear ie. O(n+k). O(n) is the complexity for making the buckets and O(k) is the complexity for sorting the
        elements of the bucket using algorithms having linear time complexity at the best case.

    Average Case Complexity: O(n)

        It occurs when the elements are distributed randomly in the array. Even if the elements are not distributed
        uniformly, bucket sort runs in linear time. It holds true until the sum of the squares of the bucket sizes is
        linear in the total number of elements.

                                                 Bucket Sort Applications

    Bucket sort is used when:

       • input is uniformly distributed over a range.
       • there are floating point values

*/