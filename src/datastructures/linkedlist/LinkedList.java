package datastructures.linkedlist;

public class LinkedList {

	





public void addFirst(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.next = head;
    head = newNode;
    if (tail == null) {
        tail = head;
    }
    size++;
}


