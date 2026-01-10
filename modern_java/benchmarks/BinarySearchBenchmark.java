package org.algorithmic.benchmark;

import org.algorithmic.benchmark.search.BinarySearch;

public class BinarySearchBenchmark {

    public static void main(String[] args) {

        int size = 1_000_000;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i * 2;
        }

        int target = array[size - 1];

        int iterations = 1_000_000;
        long startTime = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            BinarySearch.search(array, target);
        }

        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;

        System.out.println("Iterations: " + iterations);
        System.out.println("Elapsed time (ns): " + elapsed);
        System.out.println("Average per call (ns): " + (elapsed / iterations));
    }
}

