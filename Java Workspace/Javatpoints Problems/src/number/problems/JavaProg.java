package number.problems;
import java.util.*;
public class JavaProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String One");
		String input1 = sc.nextLine();
		System.out.println("Enter String Two");
		String input2 = sc.nextLine();
		System.out.println("Enter String Three");
		String input3 = sc.nextLine();
		String frnt1 = "", mid1 = "", end1 = "";
		String frnt2 = "", mid2 = "", end2 = "";
		String frnt3 = "", mid3 = "", end3 = "";
		String output1 = "", output2 = "", output3 = "";
		int len1 = input1.length();
		int len2 = input2.length();
		int len3 = input3.length();
		System.out.printf(" Length of String One : %d \n Length of String Two : %d "
				+ "\n Length of String Three : %d \n",len1,len2,len3);

		if (len1 == input1.length()) {
			if (len1 % 3 == 0) {
				frnt1 = input1.substring(0, (len1 / 3));
				mid1 = input1.substring((len1 / 3), (2 * (len1 / 3)));
				end1 = input1.substring(2 * (len1 / 3));
			} else if ((len1 - 1) % 3 == 0) {
				frnt1 = input1.substring(0, (len1 / 3));
				mid1 = input1.substring((len1 / 3), ((2 * (len1 / 3)) + 1));
				end1 = input1.substring(((2 * (len1 / 3)) + 1));
			} else if ((len1 - 2) % 3 == 0) {
				frnt1 = input1.substring(0, ((len1 / 3) + 1));
				mid1 = input1.substring(((len1 / 3) + 1), ((2 * (len1 / 3)) + 1));
				end1 = input1.substring(((2 * (len1 / 3)) + 1));
			}
		}
		if (len2 == input2.length()) {
			if (len2 % 3 == 0) {
				frnt2 = input2.substring(0, (len2 / 3));
				mid2 = input2.substring((len2 / 3), (2 * (len2 / 3)));
				end2 = input2.substring(2 * (len2 / 3));
			} else if ((len2 - 1) % 3 == 0) {
				frnt2 = input2.substring(0, (len2 / 3));
				mid2 = input2.substring((len2 / 3), ((2 * (len2 / 3)) + 1));
				end2 = input2.substring(((2 * (len2 / 3)) + 1));
			} else if ((len2 - 2) % 3 == 0) {
				frnt2 = input2.substring(0, ((len2 / 3) + 1));
				mid2 = input2.substring(((len2 / 3) + 1), ((2 * (len2 / 3)) + 1));
				end2 = input2.substring(((2 * (len2 / 3)) + 1));
			}
		}
		if (len3 == input3.length()) {
			if (len3 % 3 == 0) {
				frnt3 = input3.substring(0, (len3 / 3));
				mid3 = input3.substring((len3 / 3), (2 * (len3 / 3)));
				end3 = input3.substring(2 * (len3 / 3));
			} else if ((len3 - 1) % 3 == 0) {
				frnt3 = input3.substring(0, (len3 / 3));
				mid3 = input3.substring((len3 / 3), ((2 * (len3 / 3)) + 1));
				end3 = input3.substring(((2 * (len3 / 3)) + 1));
			} else if ((len3 - 2) % 3 == 0) {
				frnt3 = input3.substring(0, ((len3 / 3) + 1));
				mid3 = input3.substring(((len3 / 3) + 1), ((2 * (len3 / 3)) + 1));
				end3 = input3.substring(((2 * (len3 / 3)) + 1));
			}
		}
		output1 = frnt1 + mid2 + end3;
		output2 = mid1 + end2 + frnt3;
		output3 = end1 + frnt2 + mid3;
		System.out.println("Final Output");

		System.out.println(output1);
		System.out.println(output2);
		System.out.println(changeCase(output3));
	}
	public static String changeCase(String str)
	{
	 StringBuffer newS = new StringBuffer(str);
	 for(int i=0;i<str.length();i++)
	 { 
	  Character c=str.charAt(i);
	  if(Character.isLowerCase(c))
	  {
	   newS.replace(i, i+1, Character.toUpperCase(c)+"");
	  }
	  else
	  {
	   newS.replace(i, i+1, Character.toLowerCase(c)+"");
	  }
	 }
	 str=newS.toString();
	 return str;
	}


}

