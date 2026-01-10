package org.algorithmic.benchmark;

import org.algorithmic.benchmark.sort.BubbleSort;

import java.util.Random;

public class BubbleSortBenchmark {

    public static void main(String[] args) {

        int size = 10_000;
        int[] array = new int[size];
        Random random = new Random(42);

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }

        long startTime = System.nanoTime();

        BubbleSort.sort(array);

        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;

        System.out.println("Array size: " + size);
        System.out.println("Elapsed time (ns): " + elapsed);
    }
}
