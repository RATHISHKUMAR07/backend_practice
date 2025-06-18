
public class ThisKeyword
{
	public static void main(String[] args)
	{
		thiskey obj = new thiskey(7);
		obj.show(7);
	}

}
 
class thiskey
{
	// parameters and instance variables are same. 
	//So, we are using this keyword to distinguish local variable and instance variable.
	private int x;//X is instance variable
	public thiskey(int x)//X is local variable
	{
		this.x = x;//Current instance
	}
	public void show(int x)//X is local variable
	{
		System.out.println("x is "+x);
	}
	
}
