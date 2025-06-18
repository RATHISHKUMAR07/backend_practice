package Ds.Queue;

import java.util.ArrayList;

class Que{
	ArrayList<Integer> queue;
	int rear;
	int front;
	Que(){
		rear = front = -1;
		queue = new ArrayList<>();
	}
}

public class Queue  extends Que {

	void enqueue(int val) {
		if(rear == -1) {
			front = 0;
		}
		queue.add(val);
		rear++;
		
		display();
	}
	
	void dequeue() {
		if(front == -1 || rear == -1) {
			System.out.println("No Elemets");
		}
		else {
			queue.remove(front);
			rear--;
		}
		display();
	}
	
	void frontVal() {
		System.out.println("Front - " + queue.get(front));
	}
	
	void rearVal() {
		System.out.println("Rear - " + queue.get(rear));
	}
	void isEmpty() {
		if(front == -1 || rear == -1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	void display() {
		if(rear == -1) {
			System.out.println("No Elemets");
		}
		else {
			System.out.print("Elements - ");
			for(int i = front;i<=rear;i++) {
				System.out.print(queue.get(i) + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.frontVal();
		q.rearVal();
		
		q.dequeue();
		q.dequeue();
		
		q.frontVal();
		q.rearVal();
		
		q.enqueue(1);
		q.enqueue(2);
	}

}
