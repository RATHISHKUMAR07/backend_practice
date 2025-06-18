import java.util.Scanner;

public class seperateNumbersFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newstr = "";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			int ascii = (int)str.charAt(i);
			if( ascii > 47 && ascii < 59 ) {
				newstr = newstr + str.charAt(i);
				count++;
			}
				
		}
		if(count == 10)
			System.out.println(newstr);
		else
			System.out.println("Not Possible because less than 10 numbers in string");
		sc.close();

	}

}
//Input :1@2ss34^5nx67jjj8#g9i0
//Output : 1234567890
//Input :1@2ss34^5nx67jjj8#g9i
//Output : Not Possible
