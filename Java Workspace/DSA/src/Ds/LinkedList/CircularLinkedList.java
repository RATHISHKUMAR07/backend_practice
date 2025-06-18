package Ds.LinkedList;

class CNode {
	int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList{
	CNode head;

    // Insert at the beginning
    void insertBegin(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    // Insert at the end
    void insertEnd(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;
        }
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
        CNode newNode = new CNode(data);
        CNode temp = head.next;
        for (int i = 1; i < position - 1; i++) {
            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp == head) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a node with given data
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        CNode temp = head.next;
        CNode prev = head;
        while (temp != head && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == head) {
            System.out.println("CNode not found");
            return;
        }
        prev.next = temp.next;
    }

    // Display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        CNode temp = head.next;
        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
	
	public static void main(String[] args) {
        // Circular Linked List
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insertBegin(1);
        circularList.insertEnd(3);
        circularList.insertEnd(5);
        circularList.insertPos(2, 2);
        System.out.print("Circular Linked List: ");
        circularList.display();
        circularList.delete(2);
        System.out.print("After deleting 2: ");
        circularList.display();
    }
}


