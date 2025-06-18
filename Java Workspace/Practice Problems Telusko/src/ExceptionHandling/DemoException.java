package ExceptionHandling;

public class DemoException 
{
	public static void main(String[] args) 
	{
		int i,j,k=0;
		i = 8;
		j = 0;
		try
		{
			k = i/j;
		}
		catch(Exception e)//Exception is the main class of all exception
		{
			System.out.println(e);//We can give exception 
			System.out.println("Cannot divide by zero");//otherwise we can print the data to display the user
		}
		System.out.println(k);
		
	}

}
