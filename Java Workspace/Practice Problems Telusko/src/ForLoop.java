import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j = 10;j >= 1;j--)
        {
            System.out.print(j+ " ");
        }

        System.out.println("\nEnhanced for loop");
        //In enhanced for loop we cant specify the how many num we want it will fetch all the num in array
        int values[]={10,20,30,40};
        for(int i : values)
            System.out.println(i);

        String values1[]={"a","ar","arr"};
        for(String i : values1)
            System.out.println(i);

    }
}

