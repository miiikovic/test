package datastructures.linkedlist;

public class LinkedList {

	
    




    



    




    




    




    




    



    




    




    




    




    




    



    



    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}


) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}



;
        for (int i = 0; i < index; i++) {
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


