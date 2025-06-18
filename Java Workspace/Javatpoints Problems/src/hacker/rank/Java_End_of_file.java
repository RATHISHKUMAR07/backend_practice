package hacker.rank;
import java.util.*;
public class Java_End_of_file 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
    int i = 1;
    while(sc.hasNextLine())
    //The hasNextLine() method returns true if and only if this scanner has another line of input.
    {
        String s = sc.nextLine();
        System.out.println(i+" "+s);
        i++;
    }
	}

}
