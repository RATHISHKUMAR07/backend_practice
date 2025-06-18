package oops.inheritance;

class A{
	void printA(String s) {
		System.out.println("Class A " + s);
	}
}

class B extends A{
	void printB(String s) {
		System.out.println("Class B " + s);
	}
}
class C extends B{
	void printC(String s) {
		System.out.println("Class C "+ s);
	}
}

class D extends B{
	void printD(String s) {
		System.out.println("Class D " + s);
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.printB("Child");
		b.printA("Parent");
		
		C c = new C();
		c.printB("Parent");
		c.printC("Child");
		c.printA("GrandParent");
		D d = new D();
		d.printB("Parent");
		d.printD("Child");
		d.printA("GrandParent");

		
	}

}
