package org.algorithmic.benchmark.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void findsElementInMiddle() {
        int[] data = {1, 3, 5, 7, 9};
        int index = BinarySearch.search(data, 5);
        assertEquals(2, index);
    }

    @Test
    void findsFirstElement() {
        int[] data = {1, 3, 5, 7, 9};
        int index = BinarySearch.search(data, 1);
        assertEquals(0, index);
    }

    @Test
    void findsLastElement() {
        int[] data = {1, 3, 5, 7, 9};
        int index = BinarySearch.search(data, 9);
        assertEquals(4, index);
    }

    @Test
    void returnsMinusOneWhenElementIsAbsent() {
        int[] data = {1, 3, 5, 7, 9};
        int index = BinarySearch.search(data, 4);
        assertEquals(-1, index);
    }

    @Test
    void returnsMinusOneForEmptyArray() {
        int[] data = {};
        int index = BinarySearch.search(data, 10);
        assertEquals(-1, index);
    }

    @Test
    void worksWithSingleElementArrayFound() {
        int[] data = {7};
        int index = BinarySearch.search(data, 7);
        assertEquals(0, index);
    }

    @Test
    void worksWithSingleElementArrayNotFound() {
        int[] data = {7};
        int index = BinarySearch.search(data, 3);
        assertEquals(-1, index);
    }
}

