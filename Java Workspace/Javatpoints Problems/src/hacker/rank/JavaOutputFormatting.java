package hacker.rank;
import java.util.*;
public class JavaOutputFormatting 
{
	 public static void main(String[] args)
	 {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
             System.out.printf("%-14s %03d",s1,x);
             System.out.println();
         }
         System.out.println("================================");
	 }
}

//"%-15s" means that within 15 blank space, 
//the String "s1" will be filled in the left. 
//(fill in the blanks from the left) "%03d" means that within 3 0s,
//the integer"x" will be filled in the right. (fill in the zeros from the right).
//This can only be done by using printf method.