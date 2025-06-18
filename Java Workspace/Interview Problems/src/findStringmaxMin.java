import java.util.*;
public class findStringmaxMin {

	public static void main(String[] args) 
	{  
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		String[][] arr = new String[2][10];
		int[] arr1 = new int[100];
		int len = str.length();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int k=0,m=0;
		for(int i=0;i<len;i++)
		{ 
			if(str.charAt(i) != ' ' && i != len-1)
			{
				count++;
			}
			else
			{
				
				if(i == len-1)
				{
					count++;
					System.out.println("len :"+count+" ");
				}
				else
				{
					System.out.println("len :"+count+" ");
				}
				if(count < min)
				{
					min = count;
					arr1[m] = k;
					m++;
				}
				else if(count > max)
				{
					max = count;
				}
			count = 0;
			}
			
		}
		System.out.println();
		System.out.println("min :"+min+"\nmax: "+max);
		sc.close();
	}

}
