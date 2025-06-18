package byts.problems;

public class Pattern11 
{
	/*
	 12345
	  2345
	   345
	    45
	     5
	 */
	public static void main(String[] args) 
	{
	for(int i = 1;i<=5;i++)
	{
		for(int j = 1;j<=5;j++)
		{
			if(j<i)
				System.out.print(" ");
			else
				System.out.print(j);
		}
		System.out.println();
		
	}

	}

}
