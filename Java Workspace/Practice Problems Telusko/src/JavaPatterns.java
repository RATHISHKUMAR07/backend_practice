public class JavaPatterns {
    public static void main(String[] args) {

        /* Nested for loops
        for(int i = 1;i < = 1;i++)
        {
            for(int j = 1;j < = 1;j++)
            {
              .......
            }
        }

        */
        /*
        output
         row 1-->****
         row 2-->****
         row 3-->****
         row 4-->****
        */

        for(int row = 1;row <= 4;row++) // Rows
        {
            for(int col = 1;col <= 4;col++) // Columns
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("-----------");
         /*
        output
         row 1-->*
         row 2-->**
         row 3-->***
         row 4-->****
        */

        for(int row1 = 1;row1 <= 4;row1++)
        {
            for(int col1 = 1;col1 <= row1;col1++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------");
         /*
        output
         row 1-->****
         row 2-->***
         row 3-->**
         row 4-->*
        */

        for(int row2 = 4;row2 >= 1;row2--)
        {
            for(int col2 = 1;col2 <= row2;col2++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------");

               /*
        output
                    j j j j
         row 1(i)-->* * * *
         row 2(i)-->*     *
         row 3(i)-->*     *
         row 4(i)-->* * * *
        */

        for(int i = 1;i <= 4;i++)
        {
            for(int j = 1;j <= 4;j++)
            {
                if(i == 1 || i == 4 || j == 1 || j == 4 )
                {
                    System.out.print("* ");//one space
                }
                else
                {
                    System.out.print("  ");//two space
                }
            }
            System.out.println();
        }

        System.out.println("-----------");
         /*
        output
         row 1-->1 2 3 4
         row 2-->2 3 4 1
         row 3-->3 4 1 2
         row 4-->4 1 2 3
        */

        for(int i = 1;i <= 4;i++)
        {
            for(int j = 1;j <= 4;j++)
            {
                int k = i + j - 1;
                if(k>4)
                    System.out.print(k-4 +" ");
                else
                    System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
         /*
        output
         row 1-->1
         row 2-->0 1
         row 3-->1 0 1
         row 4-->0 1 0 1
         row 4-->1 0 1 0 1
        */

        for(int i = 1;i <= 5;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                if((i+j)%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("-----------");
         /*
        output
         row 1-->1
         row 2-->2 2
         row 3-->3 3 3
         row 4-->4 4 4 4
         row 5-->5 5 5 5 5
        */
        for(int i = 1;i <= 5;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
