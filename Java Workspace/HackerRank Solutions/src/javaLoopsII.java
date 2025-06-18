import java.util.*;
public class javaLoopsII {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int i=0;i<q;i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int x,y = 1;
			for(int j=1;j<=n;j++)
			{
				a = a+b;
				System.out.print(a+" ");
				b = b*2;
			}
			System.out.println();
		}
		

	}

}
