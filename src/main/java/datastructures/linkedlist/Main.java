/*
 * Copyright (c) 2023.
 */
package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();

        }

}