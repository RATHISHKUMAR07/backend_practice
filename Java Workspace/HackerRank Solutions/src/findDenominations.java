//Find the minimum number of notes used
/*
 Input:13
 Output:3
 
 Rupee notes : 20,10,5,2,1
 10+2+1=13
 So 3 notes is output
 */
import java.util.*;
public class findDenominations {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rupees,totalNotes;
		//Total rupees
		rupees = sc.nextInt();
		//No of Notes to get from user
		int notes[] = {2000,1000,500,100,50,20,10,5,2,1};
		
    	int sum = 0;
    	int count = 0;
		for(int i = 0;i<notes.length;i++)
		{
			while(sum <= rupees)
			{
				
					sum = sum + notes[i];
					count++;
					if(sum > rupees)
					{
						sum = sum - notes[i];
						count--;
						break;
					}
				
			}
		}
		System.out.println(sum);
		System.out.println("Count of total No of Notes: "+count);
		sc.close();
	}

}
