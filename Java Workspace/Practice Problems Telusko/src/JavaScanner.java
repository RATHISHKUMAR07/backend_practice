import java.util.*;
public class JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //next(); -->  can read the input only till the space.
        // It can't read two words separated by a space.
        // Also, next() places the cursor in the same line after reading the input.
        //reads input including space between the words (that is, it reads till the end of line \n )
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
