package kekw2;

// Java program to implement
// a Singly Linked List
public class LinkedList<T> {

    Node head;

    private class Node {

        T data;
        Node next;

        Node(T d) {
            data = d;
            next = null;
        }
    }


    public void insert(T data) {

        Node new_node = new Node(data);
        new_node.next = null;


        if (this.head == null) {
            this.head = new_node;
        } else {

            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }


    public void printList() {
        Node currNode = this.head;

        System.out.print("\nLinkedList: ");
        int counter = 0;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            counter++;
        }
        System.out.printf("/ size - %d \n", counter);
    }


    public void remove(int key) {
        // Store head node
        Node currNode = this.head, prev = null;

        for (int i = 0; i < key; i++) {
            if (currNode.next == null)
                throw new IndexOutOfBoundsException();
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode.next != null && prev != null)
            prev.next = currNode.next;
        else if (prev == null)
            this.head = currNode.next;

        currNode = null;
    }

    public boolean contains(T data){
        Node currNode = this.head;

        do {
            if(currNode.data == data)
                return true;

            currNode = currNode.next;
        }while (currNode.next !=null);

        return false;
    }

}
