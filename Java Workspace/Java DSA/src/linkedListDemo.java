import java.util.*;
public class linkedListDemo {

	class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public node head = null;
	//Node base address
	public node baseAddress = null;
	
	public void addNode(int data) {
		node newNode = new node(data);
		
		if(head == null) {
			head = newNode;
			baseAddress = newNode;
			newNode.next = null;
		}
		else {
			baseAddress.next = newNode;
			baseAddress = newNode;
			newNode.next = null;
		}
	}
	public void display() {
		node current = head;
		if(head == null) {
			System.out.println("The List is Empty");
		}
		else {
			//Till the last node the loop will run
			while(current != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
		System.out.println();
	}
	public void deleteNode(int data) {
		node current = head;
		node previous = head;
		if(current == null) {
			System.out.println("The list is Empty");
		}
		else {
			int i = 1;
			while(i != 0) {
				//Delete node at first
				if(head == current && data == current.data) {
					head = current.next;
				}
				//Delete node at any position
				else if(current.data == data) {
					previous.next = current.next;
					i--;
					//After deleting last node change current.next = null
					if(current.next == null && data == current.data) {
						previous.next = null; 
					}
				}
				//if data is no found move to next node
				else {
					previous = current;
					current = current.next;
				}
							
			}
		}
		
	}
	//Adding node at specific position
	public void addNodeAt(int data,int pos) {
		node newNode1 = new node(data);
		node current1 = head;
		node previous1 = head;
		int i = 1;
		int flag = 0;
		while(flag != 1) {
			//new node at first position
			if(pos == 1) {
				head = newNode1;
				newNode1.next = current1;
				flag = 1;
			}
			//new node at middle and last position
			else if(i == pos){
				previous1.next = newNode1;
				newNode1.next = current1;
				flag = 1;
			}
			else {
				previous1 = current1;
				current1 = current1.next;
				i++;
			}
		}
		
	}
	//linked list Reverse
	public void reverse() {
		node currentNode = head;
		node prevNode = null;
		node nextNode = head;
		while(nextNode != null) {
			nextNode = nextNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			}
		head = prevNode;
	}
	public static void main(String[] args) {
	
		linkedListDemo sList = new linkedListDemo();
		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);
		sList.addNode(5);
		System.out.println("Nodes in The Linked List");
		sList.display();
		sList.addNodeAt(20,6);
		sList.addNodeAt(21,3);
		sList.addNodeAt(22,1);
		System.out.println("After Adding New Nodes in The Linked List");
		sList.display();
		
		sList.deleteNode(20);
     	sList.deleteNode(22);
     	sList.deleteNode(21);
     	System.out.println("After Deleting Nodes in The Linked List");
		sList.display();
		
		sList.reverse();
		System.out.println("Reverse The Linked List");
		sList.display();
	}
}
 