public class LabeledBreakStatement {
    public static void main(String[] args) {

        for(int i = 1;i <= 4;i++)
        {
            for(int j = 1;j <= 4;j++)
            {
                if(i == 3)
                    break; // This is Unlabeled break statement it only break the 3rd row
                // it only break inner loop
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("______");

        rathish: //We can give any keyword here but we have use semicolon compulsorily
        // using this it will break outer loop
        for(int k = 1;k <= 4;k++)
        {
            for(int l = 1;l <= 4;l++)
            {
                if(k == 3)
                    break rathish; // This is labeled break statement it break the 3rd and 4th row
                System.out.print("*");
            }
            System.out.println("");
        }


    }
 }
