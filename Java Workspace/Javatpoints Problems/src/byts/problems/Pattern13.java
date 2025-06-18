package byts.problems;

public class Pattern13 {
/*
    5
   54
  543
 5432
54321
 */
	public static void main(String[] args) 
	{
		for(int i = 5;i>=1;i--)
		{
			int k = 5;
			for(int j = 1;j<=5;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(k--);
				}
			}
			System.out.println();
		}

	}

}
