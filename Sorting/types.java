
/*
 * 🧠 Types of Sorting Algorithms (Short Revision Notes)
 * 🟢 Basic Sorting (Concept Understanding)
 * 1. Bubble Sort
 * 
 * Repeatedly compares adjacent elements and swaps them if in wrong order.
 * Largest element moves to the end in each pass.
 * 
 * 👉 Simple but very slow
 * Time: O(n²)
 * 
 * 2. Selection Sort
 * 
 * Finds the minimum element and places it at the correct position one by one.
 * 
 * 👉 Few swaps
 * 👉 Always O(n²)
 * 
 * 3. Insertion Sort
 * 
 * Builds sorted array gradually by inserting each element into its correct
 * position.
 * 
 * 👉 Very fast for small or nearly sorted arrays
 * Best case: O(n)
 * 
 * 🟢 Efficient Sorting Algorithms
 * 4. Merge Sort
 * 
 * Divide array into halves → sort → merge back.
 * 
 * 👉 Stable
 * 👉 Guaranteed performance
 * Time: O(n log n)
 * 
 * Used when stability matters.
 * 
 * 5. Quick Sort
 * 
 * Select pivot → partition elements around pivot.
 * 
 * 👉 Very fast in practice
 * 👉 Most commonly used internally
 * 
 * Average: O(n log n)
 * Worst: O(n²)
 * 
 * 6. Heap Sort
 * 
 * Uses heap data structure to repeatedly extract maximum/minimum.
 * 
 * 👉 Predictable performance
 * Time: O(n log n)
 * Not stable.
 * 
 * 🟢 Linear Time Sorting (Special Cases)
 * 7. Counting Sort
 * 
 * Counts frequency of elements.
 * 
 * 👉 Works only when number range is small.
 * Time: O(n)
 * 
 * 8. Radix Sort
 * 
 * Sorts numbers digit by digit.
 * 
 * 👉 Useful for large integers.
 * 
 * 9. Bucket Sort
 * 
 * Distributes elements into buckets then sorts each bucket.
 * 
 * 👉 Works well for uniformly distributed data.
 */

// --------------------------------------------------------

/*
 * 
 * ⭐ IMPORTANT — Java Built-in Sorting (MOST USEFUL)
 * 
 * You should mostly use built-ins in real coding.
 * 
 * ✅ 1. Sort Array
 * import java.util.Arrays;
 * 
 * Arrays.sort(arr);
 * 
 * 👉 Primitive array → Dual Pivot QuickSort
 * 
 * ✅ 2. Sort Partial Range
 * Arrays.sort(arr, 1, 4);
 * ✅ 3. Reverse Order Sort
 * Integer[] arr = {5,2,8};
 * 
 * Arrays.sort(arr, Collections.reverseOrder());
 * 
 * ⚠ Works only with Integer[], not int[].
 * 
 * ✅ 4. Sort List
 * Collections.sort(list);
 * 
 * or
 * 
 * list.sort(null);
 * ✅ 5. Custom Comparator ⭐⭐⭐⭐⭐
 * 
 * Most asked in interviews.
 * 
 * Sort by second value
 * list.sort((a,b)->a[1]-b[1]);
 * Sort Objects
 * class Train{
 * int price;
 * }
 * 
 * trains.sort((t1,t2)->t1.price - t2.price);
 * ✅ 6. Descending Sort
 * list.sort(Collections.reverseOrder());
 * ✅ 7. Comparator Class
 * Collections.sort(list, new Comparator<Integer>(){
 * public int compare(Integer a, Integer b){
 * return b-a;
 * }
 * });
 * 🧠 What Java Actually Uses Internally
 * Data Type Algorithm
 * int[] Dual Pivot QuickSort
 * Objects TimSort
 * Small arrays Insertion Sort
 */