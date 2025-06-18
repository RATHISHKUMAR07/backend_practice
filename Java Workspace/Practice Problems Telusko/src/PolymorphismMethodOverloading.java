
public class PolymorphismMethodOverloading
{
	public static void main(String[] args)
	{
		method_overloading obj = new method_overloading();
		obj.show();
		obj.show(5);
		obj.show(5.5);
		obj.show();	
	}
}
//Method overloading (or) Early binding (or) Static binding (or) Compile time polymorphism
//Polymorphism(two concepts)
//   -overloading
//   -overriding

class method_overloading
//(Three or Two methods with same name but different parameters)
{
	public void show()
	{
		System.out.println("Hello");	
	}
	public void show(int i)
	{
		System.out.println("Hello "+i);	
	}
	public void show(double i)
	{
		System.out.println("Hello "+i);	
		
	}
}