package byts.problems;

public class Pattern5 {
//	5
//	54
//	543
//	5432
//	54321

	public static void main(String[] args) 
	{
		int k = 5;
		for(int i = 5;i >= 1;i--)
		{
			for(int j = k;j >= i ;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
