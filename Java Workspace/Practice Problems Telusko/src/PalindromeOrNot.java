public class PalindromeOrNot {
    public static void main(String[] args) {
        int rem,sum = 0,temp;
        int n = 123;
        temp = n;

        while(n > 0)
        {
            rem = n % 10;
            sum = (sum*10) + rem;
            n = n/10;
        }

        System.out.println(sum);
        if(temp == sum)
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
