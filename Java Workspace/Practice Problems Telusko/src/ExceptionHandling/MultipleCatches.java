package ExceptionHandling;

public class MultipleCatches
{

	public static void main(String[] args) 
	{
		int i,j,k=0;
		i = 8;
		j = 2;
		int arr[] = new int[4];
		try
		{
			k = i/j;//if this statement will throw an error the code will be terminated and goes to catch statement
			//So I changed the value of j = 0 to 2
			for(int a = 0;a < 5;a++)
			{
				arr[a] =a + 1;
			}
			for(int val : arr)
			{
				System.out.println(val);
			}
		}
		//In multiple catches the main 'Exception' should be in last
		//If it is in first it will catches all type of error so we don't need another catch method 
		//To avoid it we have give it in last
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Max Number of value is 4");
			
		}
		//The output will be displayed in last if it cause an error or not
		finally
		{
			System.out.println("BYE");
		}
		
		
		
	}
}
