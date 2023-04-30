package datastructures.linkedlist;

public class LinkedList {

	
    




public boolean contains(E element) {
    Node<E> current = head;
    while (current != null) {
        if (current.element.equals(element)) {
            return true;
        }
        current = current.next;
    }
    return false;
}


