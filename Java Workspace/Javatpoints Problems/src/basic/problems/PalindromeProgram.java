//3) Palindrome Program in Java
package basic.problems;
public class PalindromeProgram 
{
	public static void main(String args[])
	{
		int num = 545;
		int rem,temp,sum  = 0;
		temp = num;
		while(num>0)
		{
			rem = num%10;
			sum = (sum * 10) + rem;
			num = num/10;
		}
		if(temp == sum)
			System.out.println("'"+temp + "' It is palindrome Number");
		else
			System.out.println("'"+temp + "' It is not palindrome Number");
	}
}
