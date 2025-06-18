package byts.problems;

public class Pattern10 {
/*
     1
    12
   123
  1234
 12345
 */
	public static void main(String[] args)
	{
		for(int i = 1;i<=5;i++)
		{
			int k=1;
			for(int j = 5;j>=1;j--)
			{	
				if(j > i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(k);
					k++;
				}  
			}
		System.out.println();
			
		}
		
	}
}
