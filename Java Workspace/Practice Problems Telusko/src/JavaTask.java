import java.util.Scanner;
class EvenOdd
{
	public void OddAndEven(int arr[], int n)
	{
	    int odd = 1;
	    int even = 0;
	    while (true)
	    {
	    	 while (even < n && arr[even] % 2 == 0)
		            even += 2;        
		     while (odd < n && arr[odd] % 2 == 1)
		            odd += 2;
		              
		        if (even < n && odd < n)
		            {
		                int temp = arr[even];
		                arr[even] = arr[odd];
		                arr[odd] = temp;
		            }
		        else
		            break;
	    }
	}
	//TO PRINT FINAL OUTPUT
	public void Array(int arr[], int n)
	{
	    for (int i = 0; i < n; i++)
	        System.out.print(arr[i] + " ");
	} 
	      	
}
class JavaTask
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the count");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the "+ n + " numbers");
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		EvenOdd obj = new EvenOdd();
		obj.OddAndEven(arr,n);
		System.out.println("Modified Even and Odd");
		obj.Array(arr, n);
	}
}