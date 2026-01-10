/*
 * Bubble sort implementation.
 *
 * This version follows the classical algorithm taught in introductory
 * programming courses and implemented in early Pascal and C code.
 *
 * The focus here is not performance, but explicit control flow and
 * algorithmic reasoning.
 */
package org.algorithmic.benchmark.sort;

public final class BubbleSort {

    private BubbleSort() {
        // prevent instantiation
    }

    /**
     * Sorts the array in ascending order using bubble sort.
     *
     * @param array array of integers to be sorted
     */
    public static void sort(int[] array) {

        int i;
        int j;
        int temp;
        boolean swapped;

        for (i = 0; i < array.length - 1; i++) {

            swapped = false;

            for (j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // if no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

