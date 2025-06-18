public class ArmstrongNumberOrNot {
        public static void main(String[] args) {
            int r,sum = 0,temp;
            int n = 153;
            temp = n;

            while(n > 0)
            {
                r = n % 10;
                sum = sum + r*r*r;
                n = n/10;
            }
            if(temp == sum)
                System.out.println("This is Armstrong");
            else
                System.out.println("Not Armstrong");
        }
}

