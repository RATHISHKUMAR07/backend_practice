package Ds.Stack;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}

public class StackLL {

	Node push(int val, Node head) {
	
		Node newNode = new Node(val);
		if(head == null) {
			return newNode;
		}
		System.out.print("Elements - ");

		newNode.next = head;
		head = newNode;
		display(head);
		return head;
		
	}
	
	Node pop(Node head) {
		if(head == null)
			System.out.println("Underflow");
		System.out.print("Elements - ");
		head = head.next;
		display(head);
		return head;
		
	}
	
	void peek(Node head) {
		if(head == null) {
			System.out.println("No Elements");
			return;
		}
		System.out.println(head.val);
	}
	
	boolean isEmpty(Node head) {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	void display(Node head) {
		if(head == null) {
			System.out.println("No Elements");
			return;
		}
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackLL stack = new StackLL();
		Node head = null;
		head = stack.push(1,head);
		head = stack.push(2,head);
		head = stack.push(3,head);
		head = stack.push(4,head);
		head = stack.push(5,head);
		
		
		stack.pop(head);
				
		stack.peek(head);
		
		System.out.println(stack.isEmpty(head));

	}

}
