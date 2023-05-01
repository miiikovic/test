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
}



        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}


