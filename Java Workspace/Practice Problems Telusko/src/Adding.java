public class Adding {
    public static void main(String[] args) {
        int a,b,c;
        a = 5;
        b = 4;
        c = a + b;
        System.out.println(c);
        System.out.println("The addition is "+c);//To combine with strings in double quotes we use '+'
        System.out.println("The addition of " +a+ " and " +b+ " is " +c); //And we can combine like this also

        //In java printf is supported like in c++
        System.out.printf("The addition of %d and %d is %d",a,b,c);
    }
}
