public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Encap obj = new Encap();
		obj.setAge(20);
		obj.setName("Rathish");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}
//Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
//In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. 
//Therefore, it is also known as data hiding.
//To achieve encapsulation in Java 
//      -Declare the variables of a class as private.
//		-Provide public set and get methods to modify and view the variables values.
class Encap
{
	private int age;
	private String name;
	
	public void setAge(int i)
	{
		age = i;
	 
	}
	public void setName(String j)
	{
		name = j;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}
