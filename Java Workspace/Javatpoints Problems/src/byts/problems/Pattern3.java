package byts.problems;
public class Pattern3
{
//	12345
//	1234
//	123
//	12
//	1
	public static void main(String[] args)
	{
		int k = 5;
		for(int i = 1;i <= 5;i++)
		{
			for(int j = 1;j <= k;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			k--;
		}
	}
}