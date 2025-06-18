 import java.util.Scanner;
/*
 Input
 100000
 Output
 Decimal To Binary : 11000011010100000
 Decimal To Binary : 11000011010100000
 */
public class decimalToBinary {
	public long binToDecConverter(long num) {
		long res = 0;
		long mul = 1;
		while(num != 0) {
			long rem = num%2;
			num = num/2;
			res = res + rem * mul;
			mul = mul * 10;
		}
		return res;
	}
	public static void main(String[] args) {
		decimalToBinary s = new decimalToBinary();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long res = s.binToDecConverter(num);
		System.out.println("Decimal To Binary : "+res);
		System.out.println("Decimal To Binary : "+ Integer.toBinaryString (num));
		sc.close();
	}

}
