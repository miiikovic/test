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
}


Node;
        }
        size++;
    }
}



 (tail == null) {
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


