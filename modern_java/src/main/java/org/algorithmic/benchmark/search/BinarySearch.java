/*
 * Binary search implementation.
 *
 * This version follows the same reasoning used in the original
 * Pascal and C implementations: explicit indices, explicit loop,
 * and integer arithmetic instead of abstractions.
 *
 * The array is assumed to be sorted in ascending order.
 */
package org.algorithmic.benchmark.search;

public final class BinarySearch {

    private BinarySearch() {
        // prevent instantiation
    }

    /**
     * Searches for a target value inside a sorted array.
     *
     * @param array  sorted array of integers
     * @param target value to search
     * @return index of the target, or -1 if not found
     */
    public static int search(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start <= end) {

            // shift instead of division by 2
            mid = (start + end) >> 1;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

