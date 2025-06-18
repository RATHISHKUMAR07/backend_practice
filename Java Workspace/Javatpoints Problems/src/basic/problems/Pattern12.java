package basic.problems;

public class Pattern12 {
/*
12345
 1234
  123
   12
    1
 */
	public static void main(String[] args)
	{
		for(int i = 1;i<=5;i++)
		{
			int k = 1;
			for(int j = 1;j<=5;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(k++);
				
			}
			System.out.println();
			
		}


	}

}
