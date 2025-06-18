public class MutipleInterfaces 
{
	public static void main(String[] args)
	{
		samp1 obj = new multiple();
		samp2 obj1 = new multiple();
		obj.show();
		obj1.display();
	}
}
//In java we can't achieve multiple inheritance So we are using Interfaces
interface samp1
{
	void show();
}
interface samp2
{
	void display();
}
class multiple implements samp1,samp2
{
	public void show()
	{
		System.out.println("In Show");
	}
	public void display()
	{
		System.out.println("In Display");
	}
}