public class AbstractClass 
{
	public static void main(String[] args) 
	{
		Maheshphone obj =  new Sureshphone();//
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	}
}
abstract class Maheshphone//Abstract Class
{
	public void call()
	{
		System.out.println("Calling");
	}
	public abstract void move();//Abstract Methods
	public abstract void dance();//Abstract Methods
	public abstract void cook();//Abstract Methods
}
abstract class Rameshphone extends Maheshphone // ramesh --> Concrete
{
	public void move()
	{
		System.out.println("Moving");
	}
}
class Sureshphone extends Rameshphone// suresh --> Concrete

{
	public void dance()
	{
		System.out.println("Dancing");
	}
	public void cook()
	{
		System.out.println("Cooking");
	}
}