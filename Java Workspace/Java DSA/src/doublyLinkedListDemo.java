import java.util.Base64;

public class doublyLinkedListDemo {
	
	class Node {
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node base = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			base = newNode;
			newNode.next = null;
			newNode.prev = null;
		}
		else {
			newNode.prev = base;
			base.next = newNode;
			base = newNode;
			newNode.next = null;
		}
	}
	
	public void display() {
		Node tempN = head;
		int flag = 0;
		while(tempN != null) {
			System.out.print(tempN.data+" ");
			flag = 1;
			tempN = tempN.next;
		}
		System.out.println(flag);
		
	}

	public static void main(String[] args) {
		doublyLinkedListDemo dLinkedList = new doublyLinkedListDemo();
		
		dLinkedList.addNode(1);
		dLinkedList.addNode(2);
		dLinkedList.addNode(3);
		dLinkedList.addNode(4);
		dLinkedList.addNode(5);

		dLinkedList.display();
	}

}
