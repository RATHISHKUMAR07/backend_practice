import java.util.*;
public class arrayInsert {

	public static void main(String[] args)
	{
//Insertion at Specific position
		
		Scanner sc = new Scanner(System.in);
		int[] a= new int[10];
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();

		int i,pos,num;
		System.out.println("Enter "+size+" Array");
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Postion");
		pos=sc.nextInt();
		System.out.println("Enter Number to Insert");
		num=sc.nextInt();
		if(pos<=0 || pos>size+1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			for(i=size-1;i>=pos-1;i--)
			{
				a[i+1]=a[i];
			}
			a[pos-1]=num;
			size++;
			for(i=0;i<size;i++)
			{
				System.out.println("Element of Index["+i+"]="+a[i]);
			}	
		}
	}

}
