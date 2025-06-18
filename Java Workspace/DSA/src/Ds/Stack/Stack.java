package Ds.Stack;
import java.util.*;
class Stk{
	int top;
	ArrayList<Integer> arr;
	Stk(){
		top = -1;
		arr = new ArrayList<>();
		
	}
}

public class Stack extends Stk{
	
	void push(int val) {
		arr.add(val);
		top++;
	}
	
	int pop() {
		if(top == -1){
			System.out.println("Underflow");
			return -1;
		}
		
		int val = (Integer)arr.remove(top);
		top--;
		
		return val;
	}
	
	void peek() {
		if(top == -1) {
			System.out.println("No Elements");
		}
		int val = ((Integer) arr.get(top));
		System.out.println(val);
	}
	
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		for(int i = top;i >= 0 ; i--) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.pop();
		
		stack.display();
		
		stack.peek();
		
		System.out.println(stack.isEmpty());

	}

}
