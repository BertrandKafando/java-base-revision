# Extra 

# Arrays.sort Complexity

```
    Arrays.sort works an array and Collections.sort works on Lists.

    Collections.sort converts Lists into arrays then calls Arrays.sort.

    Arrays.sort has two different sorting algorithms. Quicksort, a non-stable algorithm, and Timsort, a stable algorithm. Both share a time complexity of O(n log n), where n is the total number of items in the array.

    Including the comparator is O(n * (log n) * c, where c is the time complexity of the comparator.

    Arrays.sort determines which sorting algorithm to use based on the type of parameter. Quicksort for primitive data types and Timsort for objects.

    A stable sorting algorithm means items of equal value stay in the same order after sorting.


```