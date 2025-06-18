package Ds.LinkedList;
import java.util.*;

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedList {
	Node head;

	Node insertBeg(int val, Node head) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			return head;
		}
		else {
			newNode.next = head;
		}
		
		return newNode;
	}

	Node insertEnd(int val, Node head) {
		Node newNode = new Node(val);
		Node traverse = head;
		if(head == null) {
			head = newNode;
			return head;
		}
		
		while(traverse.next != null) {
			traverse = traverse.next;
		}
		
		traverse.next = newNode;
		
		return head;

	}

	Node insertPos(int val, int pos, Node head) {
		
		Node newNode = new Node(val);
		Node traverse = head;
		if(pos == 1) {
			newNode.next = head;
			return newNode;
		}
		
		
		
		for(int i=1;traverse.next != null && i<pos-1;i++) {
			traverse = traverse.next;
		}
		newNode.next = traverse.next;
		traverse.next = newNode;
		return head;

	}

	Node delete(int pos, Node head) {
		Node traverse = head;
		for(int i=1;traverse.next != null && i<pos-1;i++) {
			traverse = traverse.next;
		}
		traverse.next = traverse.next.next;
		return head;

	}

	int length(Node head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		
		return count;

	}

	Node reverse(Node head) {
		
		Node prevNode=null,curNode=head,nextNode=null;
		while(curNode!=null)
		{
			nextNode=curNode.next;
			curNode.next=prevNode;

			prevNode=curNode;
			curNode=nextNode;
		}

		head=prevNode;
		return head;

	}

	void display(Node head) {
		if(head == null)
			System.out.println("Linked List is Empty");
		
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.head = null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("********* MENU *********");
			System.out.println("1.Insert In End");
			System.out.println("2.Insert In Beg");
			System.out.println("3.Insert At A  Particular Pos");
			System.out.println("4.Delete At a Pos");
			System.out.println("5.Length");
			System.out.println("6.Reverse");
			System.out.println("7.Display");
			System.out.println("8.Exit");
			System.out.println("Enter ur choice : ");
			int n = in.nextInt();
			switch (n) {
			case 1:
				System.out.println("enter the value ");
				l.head = l.insertEnd(in.nextInt(), l.head);
				break;
			case 2:
				System.out.println("enter the value");
				l.head = l.insertBeg(in.nextInt(), l.head);
				break;
			case 3:
				System.out.println("enter the value and position");
				l.head = l.insertPos(in.nextInt(), in.nextInt(), l.head);
				break;
			case 4:
				l.head = l.delete(in.nextInt(), l.head);
				break;
			case 5:
				System.out.println(l.length(l.head));
				break;
			case 6:
				l.head = l.reverse(l.head);
				break;
			case 7:
				l.display(l.head);
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("\n Wrong Choice!");
				break;
			}
			System.out.println("\n do u want to cont... ");
		} while (in.nextInt() == 1);

	}

}
