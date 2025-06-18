import java.util.*;
public class arraysDSA {
	public static void main(String[] args)
	{
// Traversing of an Array
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a= new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println("Element of Index["+i+"]="+a[i]);
		}	

	}

}
