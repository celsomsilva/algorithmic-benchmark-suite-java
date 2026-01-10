package org.algorithmic.benchmark.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortsAlreadySortedArray() {
        int[] data = {1, 2, 3, 4, 5};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @Test
    void sortsReverseOrderArray() {
        int[] data = {5, 4, 3, 2, 1};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @Test
    void sortsArrayWithDuplicates() {
        int[] data = {3, 1, 2, 3, 1};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, data);
    }

    @Test
    void worksWithSingleElementArray() {
        int[] data = {7};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{7}, data);
    }

    @Test
    void worksWithEmptyArray() {
        int[] data = {};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{}, data);
    }
}

