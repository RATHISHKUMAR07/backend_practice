import java.util.*;
public class lowerToUpperAndUpperToLower {

	    public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str  = sc.nextLine();
	        String demo = "";
	        
	       for(int i=0;i<str.length();i++){
	           if(Character.isLowerCase(str.charAt(i)) || str.charAt(i) != ' '){
	               demo = demo + Character.toUpperCase(str.charAt(i));
	           }
	           else if(Character.isUpperCase(str.charAt(i))){
	               demo = demo + Character.toLowerCase(str.charAt(i));
	           }
	       }
	        str = demo;
	        System.out.println(demo);
	        System.out.print(str);
	        sc.close();
	    }
	}

