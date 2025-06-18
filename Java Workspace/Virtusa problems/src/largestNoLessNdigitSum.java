import java.util.Scanner;

/*
Largest number less than N with digit sum greater than the digit sum of N
Given an integer N, the task is to find the greatest number less than N such that the sum of its digits is greater than the sum of the digits of N. If the condition isn’t satisfied for any number then print -1.
Examples:
Input: N = 100 --> sum = 1
less than 99  --> sum = 18
Output: 99
So 18 > 1 print 99
99 is the largest number less than 100 sum of whose digits is greater than the sum of the digits of 100
Input: N = 49 --> 13
less than 48 --> 12
So 12 > 13 condition fails print -1
Output: -1
 */
public class largestNoLessNdigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int sum1 = 0;
		int num = N;
		while(num != 0) {
			int rem;
			rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		N = N-1;
		int res = N;
		while(N != 0) {
			int rem1;
			rem1 = N%10;
			sum1 = sum1 + rem1;
			N = N/10;
		}
		if(sum1 > sum) {
			System.out.println(res);
		}
		else {
			System.out.println(-1);
		}
		sc.close();
	}

}
