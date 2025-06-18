package oops.abstractraction;

abstract class Abstract{
	 abstract void absMethod();
}



public class AbstractClass  extends Abstract{
	
	void absMethod() {
		System.out.println("Abstract method overidden");
	}

	public static void main(String[] args) {
		Abstract abs = new AbstractClass();
		
		abs.absMethod();
	}

}
