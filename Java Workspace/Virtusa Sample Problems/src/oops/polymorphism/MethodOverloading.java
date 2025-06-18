package oops.polymorphism;
class Arithmetic{
	static int add(int a , int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a + b +c;
	}
	static int sub(int a , int b) {
		return a-b;
	}
	static int mul(int a , int b,int c) {
		return a * b * c;
	}
	static int mod(int a , int b) {
		return a % b;
	}
	static int div(int a , int b) {
		return a/b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
			System.out.println("Addition 2 - " + Arithmetic.add(1, 2));
			System.out.println("Addition 3 - " + Arithmetic.add(1, 2, 3));
			System.out.println("Subtraction - " + Arithmetic.sub(1, 2));			
			System.out.println("Multiplication - " + Arithmetic.mul(1, 2, 3));
			System.out.println("Modulus - " + Arithmetic.mod(1, 2));
			System.out.println("Division - " + Arithmetic.div(4, 2));

			
	}

}
