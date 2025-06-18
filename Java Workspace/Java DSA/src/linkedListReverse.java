public class linkedListReverse {
	class Node{
		int data;
		Node next;
		public Node(int data){
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
		}
		else {
			base.next = newNode;
			base = newNode;
			newNode.next = null;
		}
	}
	public void display() {
		Node tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.data+" "); 
			tempNode = tempNode.next;
		}
		System.out.println();
	}
	
	public void reverseSinglyList() {
		Node currentNode = head;
		Node prevNode = null;
		Node nextNode = head;
		
		while(nextNode != null) {
			nextNode = nextNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}
	public static void main(String[] args) {
		linkedListReverse sListReverse = new linkedListReverse();
		sListReverse.addNode(1);
		sListReverse.addNode(2);
		sListReverse.addNode(3);
		sListReverse.addNode(4);
		sListReverse.addNode(5);
		
		System.out.println("Nodes in the linked list");
		sListReverse.display();
		
		sListReverse.reverseSinglyList();
		System.out.println("Reverse Linked list Iteratively");
		sListReverse.display();
	}

}
