import java.util.Scanner;
/*
Queries on sum of odd number digit sums of all the factors of a number
Given Q queries. Each query contain a positive integer n. The task is to output the sum of sum of odd number digit contained in all the divisors of n.

Examples :
Input : Q = 2, n1 = 10, n2 = 36
Output : 7 18
For Query1,
Divisors of 10 are 1, 2, 5, 10.
Sum of odd digits in 1 is 1, in 2 is 0, in 5 is 5, in 10 is 1.
So, sum became 7.

For Query 2,
Divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Sum of odd digits in 1 is 1, in 2 is 0, in 3 is 3, in 4 is 0,
in 6 is 0, in 9 is 9, in 12 is 1, in 18 is 1, in 36 is 3.
So, sum became 18.
 */
public class oddNumberSumOfAllFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Sample numbers :");
		int noCount = sc.nextInt();
		int[] number= new int[noCount];
		for(int i = 0;i<noCount;i++) {
			System.out.println("Enter Number "+i+" :");
			number[i] = sc.nextInt();
		}
		for(int i = 0;i < noCount;i++) {
			int sum = 0;
			for(int j = 1;j<=number[i];j++) {
				int n;
				n = number[i]%j;
				if(n == 0) {
					if(j%2 != 0) {
						sum = sum + j;
					}
					if(j>=10) {
						int num = j;
						num = num/10;
						sum = sum+num;
					}
				}
			}
			System.out.println("The output of "+number[i]+" :"+sum);
		}
		sc.close();
		}

}
