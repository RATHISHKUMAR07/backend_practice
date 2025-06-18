public class PolymorphismMethodOverriding
{
	public static void main(String[] args)
	{
		method_overriding1 obj = new method_overriding1();
		obj.show();	
	}
}
//Method overriding (or) Late binding (or) Dynamic binding (or) Runtime polymorphism
//Polymorphism(two concepts)
//   -overloading
//   -overriding
class method_overriding
//(When you have two methods with same parameters & same name but different class)
{
	public void show()
	{
		System.out.println("Hello Statement 1");	
	}
}
class method_overriding1 extends method_overriding
//(When you have two methods with same parameters & same name but different class)
{
	public void show()
	{
		//Here method 2 overrides method 1 this is overriding
		//Output --> Hello Statement 2
		System.out.println("Hello Statement 2");	
	}
}