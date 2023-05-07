package datastructures.linkedlist;

public class LinkedList {

	
    




    



    




    




    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }
}


