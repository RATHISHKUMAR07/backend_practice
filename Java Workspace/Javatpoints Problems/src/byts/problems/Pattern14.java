package byts.problems;

public class Pattern14 {
/*
    5
   45
  345
 2345
12345

 */
	public static void main(String[] args) 
	{
		for(int i = 5;i>=1;i--)
		{
			for(int j = 1;j<=5;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}

	}

}
