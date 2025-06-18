import java.util.Scanner;
/*
Write a program to print the pyramid up to the passed integer value.
1
2 3
4 5 6
7 8 9 10
11 12 13 . .
If we pass the value 13 it should print like the above (no need to print the 3 dots)
 */
public class pyramidUsingContinuousNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 1;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				if(num > 13) {
					System.out.print(". ");
				}
				else {
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
			
			scanner.close();
	}

}
