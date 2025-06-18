package byts.problems;

public class Pattern19
{
	/*
	h
	he
	hel
	hell
	hello
	*/ 
	public static void main(String[] args) 
	{
		for(int i = 1;i<=5;i++)
		{
			String[] k= {"h","e","l","l","o"};
			for(int j = 0;j<i;j++)
			{			
				System.out.print(k[j]);
			}
			System.out.println();
		}

	}
}
