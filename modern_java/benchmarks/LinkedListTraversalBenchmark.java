package org.algorithmic.benchmark;

import org.algorithmic.benchmark.structures.LinkedList;

public class LinkedListTraversalBenchmark {

    public static void main(String[] args) {

        int size = 1_000_000;
        LinkedList.Node head = null;

        // build list
        for (int i = 0; i < size; i++) {
            LinkedList.Node node = new LinkedList.Node();
            node.setData(i);
            node.setNext(head);
            head = node;
        }

        // traversal benchmark
        long start = System.nanoTime();

        LinkedList.Node current = head;
        while (current != null) {
            current = current.getNext();
        }

        long end = System.nanoTime();

        System.out.println("List size: " + size);
        System.out.println("Traversal time (ns): " + (end - start));
    }
}

