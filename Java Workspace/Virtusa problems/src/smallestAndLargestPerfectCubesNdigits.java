/*
Smallest and Largest N-digit perfect cubes
Given an integer N, the task is to find the smallest and the largest N digit numbers which are also perfect cubes.
Examples:
Input: N = 2
Output: 27 64
27 and 64 are the smallest and the largest 2-digit numbers which are also perfect cubes.
Input: N = 3
Output: 125 729 
 */
import java.util.Scanner;
public class smallestAndLargestPerfectCubesNdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Digits :");
		int noOfDigits = sc.nextInt();
		int power = 1;
		for(int i = 0;i<noOfDigits;i++) {
			power = power * 10;
		}
		int largest = Integer.MIN_VALUE;
		int minRange = (power/10)-1;
		int maxRange = power-1;
		System.out.println("Maximum Range :"+maxRange);
		System.out.println("Minimum Range :"+minRange);
		int result = 0;
		int smallest = Integer.MAX_VALUE;
		System.out.println(largest+" "+smallest);
		for(int powerCubes = 1;true;powerCubes++) {
			result = powerCubes * powerCubes * powerCubes;
			if(result > maxRange) {
				break;
			}
			if(result > minRange) {
				if(result<smallest) {
					smallest = result;
				}
			}	
			if(result > largest) {
				largest = result;
			}
		}
		System.out.println("Smallest Perfect Cubes :"+smallest);
		System.out.println("Largest Perfect Cubes :"+largest);
		sc.close();
	}

}
