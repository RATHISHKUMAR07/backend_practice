import java.util.Scanner;
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long sum = isperfect(num);
        if (sum == num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }

    public static long isperfect(long num) {
        long sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

}

