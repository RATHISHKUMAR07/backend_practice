import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3;
        System.out.println("Enter Count of Fibonacci Series2");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(n2);//printing 1

        for(int i=1;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
