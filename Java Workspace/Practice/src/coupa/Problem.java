package coupa;

import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        
        while (i < sb.length() - 1) {
            String s = sb.substring(i, i + 2);
            
            if (s.equals("WX") || s.equals("YZ")) {
                sb.delete(i, i + 2);
                
                if (i > 0) {
                    i--;
                }
            } 
            else {
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}
