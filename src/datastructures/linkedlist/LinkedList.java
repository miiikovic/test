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


t i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}


xt = newNode;
            tail = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }
}


