import java.util.*;
/*
 Input - motivation
 Output - notivatiom
 Input - good day
 Output - yood dag
 
 */
public class stringConsonantReverse {
	
	static boolean isConso(char s) {
		return (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u');
	}
	static String reverseConso(String str){
		int j = 0;
		String conso = "";
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(isConso(arr[i]) != true) {
				j++;
				conso += arr[i];	
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(isConso(arr[i]) != true) {
				arr[i] = conso.charAt(--j);
			}
		}
		return String.valueOf(arr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseConso(str));
		sc.close();
	}

}
