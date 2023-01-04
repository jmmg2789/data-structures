public class Exercise01 {

    // 1. Sort 10 schools around your house by distance
    // Insertion sort because it is a small size, and it's fast on small sample sizes.
    // Also has a space complexity of O(1).

    // 2. eBay sorts listings by the current bid amount
    // Use radix or counting since a bid is usually a dollar amount.
    // These are numbers in a fixed range and these have a fast time complexity.

    // 3. Sport scores on ESPN
    // Quick sort because it is most efficient and don't want to use too much
    // memory as it can be a large amount of scores.

    // 4. Massive database (cannot fit all into memory) needs to sort past year's user data
    // Merge sort because we are not sorting in memory, and we worry about performance.
    // Since it is large, we want to ensure consistency.

    // 5. Almost sorted Udemy review data needs to update and add 2 new reviews
    // Insertion sort as it is almost completely sorted already.

    // 6. Temperature records for the past 50 years in Canada
    // Radix or counting if temps are consistent in range. If not, quick sort
    // for some in memory sorting.

    // 7. Large username database needs to be sorted. Data is very random.
    // Merge sort to prevent memory usage and want to ensure consistency.

    // 8. You want to teach sorting for the first time
    // Bubble sort as it is very simple to implement.

}
