import java.util.Scanner;

public class findNoOfOnesInBinary {
/*
 * Find out the number of 1’s.
 Input - 1011011000
 Output - 5
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 0;
		while(n!=0) {
			long rem = n%10;
			if(rem == 1) {
				count+=1;
			}
			n= n/10;
		}
		System.out.println("Number of 1's in Given Number - "+count);
		sc.close();
	}

}
