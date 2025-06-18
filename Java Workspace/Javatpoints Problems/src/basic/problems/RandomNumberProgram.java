//6) How to Generate Random Number in Java
package basic.problems;
import java.util.*;   
public class RandomNumberProgram 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int a = random.nextInt(20);
		System.out.println("Random Number between 0 t0 19 : "+a);
	}
}
