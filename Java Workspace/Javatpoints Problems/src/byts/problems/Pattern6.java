package byts.problems;

public class Pattern6 {

	public static void main(String[] args) 
	{
		int k;
		k = 5;
		for(int i = 1;i <= 5;i++)
		{
			for(int j = k;j <= 5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			k--;
		}
	}
}


