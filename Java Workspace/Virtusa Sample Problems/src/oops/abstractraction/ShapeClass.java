package oops.abstractraction;
abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle shape");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Circle shape");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Square shape");
	}
}
public class ShapeClass {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Square();
		s.draw();
		
			
	}

}
