package oops.inheritance;

interface Developer{
	void getDeveloper();
	static void developer(int id) {
		System.out.println("developer default " + id);
	}
	
}

interface Tester{
	void getTester();
	default void tester() {
		System.out.println("tester default");
	}
}

class Office implements Developer, Tester{
	public void getDeveloper() {
		System.out.println("Developer");
	}

	public void getTester() {
		System.out.println("Tester");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Office o = new Office();
		o.getDeveloper();
		o.getTester();
		Developer.developer(1);
		o.tester();
	}

}
