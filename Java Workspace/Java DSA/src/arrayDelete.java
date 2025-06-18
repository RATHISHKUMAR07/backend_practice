import java.util.*;
public class arrayDelete {

	public static void main(String[] args) {

//Deletion from specific position
		
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
		if(pos<=0 || pos>size+1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			for(i=pos-1;i<size;i++)
			{
				a[i]=a[i+1];
			}
			for(i=0;i<size-1;i++)
			{
				System.out.println("Element of Index["+i+"]="+a[i]);
			}
				
		}
	}

}
