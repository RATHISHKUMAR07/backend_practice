import java.util.Scanner;
public class twoDArray {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Row");
		int row=sc.nextInt();
		System.out.println("Enter size of Column");
		int col=sc.nextInt();
		int[][] array = new int[row][col];
		int i,j;
		System.out.println("Enter "+row*col+" values");
		for(i=0;i<row;i++)
		{ 
			for(j=0;j<col;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Display "+row+"X"+col +" matix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("["+i+"]["+j+"]="+array[i][j]+"   ");
			}
			System.out.println();	
		}

	}

}
