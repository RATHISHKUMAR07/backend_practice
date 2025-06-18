package Ds.LinkedList;


class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DoublyLinkedList {
    DNode head;

    // Insert at the beginning
    void insertBegin(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at the end
    void insertEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at a given position
    void insertPos(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            insertBegin(data);
            return;
        }
        DNode newNode = new DNode(data);
        DNode temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node with given data
    void delete(int data) {
        DNode temp = head;
        if (temp != null && temp.data == data) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Reverse the doubly linked list
    void reverse() {
        DNode current = head;
        DNode temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Display the doubly linked list
    void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
    	DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.insertBegin(1);
        doublyList.insertEnd(3);
        doublyList.insertPos(2, 2);
        System.out.print("Doubly Linked List: ");
        doublyList.display();
        doublyList.delete(2);
        System.out.print("After deleting 2: ");
        doublyList.display();
        doublyList.reverse();
        System.out.print("Reversed List: ");
        doublyList.display();

    }
}
