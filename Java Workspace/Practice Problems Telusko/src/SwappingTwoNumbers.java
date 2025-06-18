public class SwappingTwoNumbers {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int temp;
        System.out.println("Method 1");
        // method 1
        //We are using three variables so the memory is high
        // to avoid missing actual number of a we are using temp variable to store in it
        temp = a;
        a = b;
        b = temp;

        System.out.println("a : " +a);
        System.out.println("b : " +b);

        System.out.println("Method 2");
        // method 2
        //We are using three variables so the memory is high
        // to avoid missing actual number of a we are using temp variable to store in it
        int a1 = 5;
        int b1 = 4;
        a1 = a1+b1;
        b1 = a1-b1;
        a1 = a1-b1;

        System.out.println("a1 : " +a1);
        System.out.println("b1 : " +b1);

        System.out.println("Method 3");
        // method 3
        //when Compare to three methods --> method 3 using less memory or bits
        /*
        ^ --> XOR
        1 1 --> 0
        1 0 --> 1
        0 1 --> 1
        0 0 --> 0
        */
        int a2 = 5 ;// 1 0 1
        int b2 = 4 ;// 1 0 0
        a2 = a2^b2; // 1 0 1 XOR 1 0 0
        b2 = a2^b2; // 0 0 1 XOR 1 0 1 ---> 5
        a2 = a2^b2; // 0 0 1 XOR 1 0 0 ---> 4

        System.out.println("a2 : " +a2);
        System.out.println("b2 : " +b2);


        int i = 5;
        int j = 4;

        j = i + j - ( i = j);

        System.out.printf("Method 4 \n %d  %d",i,j);
    }
}
