package datastructures.linkedlist;

public class LinkedList {

	
    





    




    




    



    




    



    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}



i < index; i++) {
            current = current.next;
        }
        return current;
    }
}


