package org.algorithmic.benchmark.structures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void buildsTraversesAndInsertsCorrectly() {

        // setup (equivalent to Pascal code)
        LinkedList.Node head = new LinkedList.Node();
        head.setData(2);
        head.setNext(null);

        LinkedList.Node p = new LinkedList.Node();
        p.setData(6);
        p.setNext(head);
        head = p;

        LinkedList.Node aux = new LinkedList.Node();
        aux.setData(9);
        aux.setNext(head);
        head = aux;

        // search
        LinkedList.Node current = head;
        while (current.getData() != 2) {
            current = current.getNext();
        }

        // insert after search
        LinkedList.Node aux2 = new LinkedList.Node();
        aux2.setData(10);
        aux2.setNext(null);
        current.setNext(aux2);

        // verify final sequence: 9 -> 6 -> 2 -> 10
        int[] expected = {9, 6, 2, 10};
        int index = 0;

        current = head;
        while (current != null) {
            assertEquals(expected[index++], current.getData());
            current = current.getNext();
        }

        assertEquals(expected.length, index);
    }
}

