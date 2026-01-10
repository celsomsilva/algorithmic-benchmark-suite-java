package org.algorithmic.benchmark.structures;

/*
 * Direct translation of a classical Pascal pointer-based linked list.
 *
 * This code intentionally avoids OO abstractions.
 * It mirrors the original model: manual pointer manipulation,
 * temporary auxiliary pointers, and explicit traversal.
 */
public class LinkedList {

    public static class Node {
    
	private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Node prim;
        Node aux;
        Node p;
        Node aux2;

        /* new(prim); */
        prim = new Node();
        prim.data = 2;
        prim.next = null;

        /* new(p); p^.data := 6; p^.next := prim; prim := p; */
        p = new Node();
        p.data = 6;
        p.next = prim;
        prim = p;

        /* new(aux); aux^.data := 9; aux^.next := prim; prim := aux; */
        aux = new Node();
        aux.data = 9;
        aux.next = prim;
        prim = aux;

        /* traversal */
        Node savePrim = prim;
        while (prim.next != null) {
            System.out.print(prim.data + " ");
            prim = prim.next;
        }
        System.out.println();

        /* restore head */
        prim = savePrim;

        /* search (procura) */
        while (prim.data != 2) {
            System.out.print(prim.data + " ");
            prim = prim.next;
        }
        System.out.println();

        /* insertion after search */
        aux2 = new Node();
        aux2.data = 10;
        aux2.next = null;
        prim.next = aux2;

        /* elimination example */
        aux = p;

        System.out.println();
        while (aux != null) {
            System.out.print(aux.data + " ");
            aux = aux.next;
        }
    }
}

