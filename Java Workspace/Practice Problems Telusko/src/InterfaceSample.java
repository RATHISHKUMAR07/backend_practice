public class InterfaceSample 
{
	public static void main(String[] args) 
	{
		sample obj = new interfaceimpliments();
		obj.show();
	}
}
//It is used to achieve abstraction.
//By interface, we can support the functionality of multiple inheritance.
//It can be used to achieve loose coupling.
interface sample
{
	void show();
}
class interfaceimpliments implements sample
{
	public void show()
	{
		System.out.print("In Show");
	}
}
