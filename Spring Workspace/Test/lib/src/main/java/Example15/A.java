package Example15;

public class A {
	B b;
	A(){
		System.out.println("A is Created");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	void print() {
		System.out.println("Hello A");
	}
	void display() {
		print();
		b.print();
	}
}
