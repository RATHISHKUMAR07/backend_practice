public class Arrays2d3d {
    public static void main(String[] args) {
        System.out.println("1 Dimension Array");
        int ar[] = {10,20,30,40,50};
        for(int i = 0;i < ar.length;i++)
        {
          System.out.println("a["+i+"] : "+ar[i]);
        }
        System.out.println("---------------");

        System.out.println("2 Dimension Array");
        int a[][] = {
                     {1,2,3},
                     {4,5,6,7},
                     {9,0}
                    };
        for(int i = 0;i < a.length;++i)
        {
            for(int j = 0;j < a[i].length;++j)
            {
                System.out.println("a["+i+"]["+j +"] : "+a[i][j]);
            }
        }
        System.out.println("---------------");
        System.out.println("3 Dimension Array");
        int[][][] arr = {
                          {
                              { 1, 2,15},
                              { 3, 4 ,9}
                          },
                          {
                              { 5, 6,10 },
                              { 7, 8,11 }
                          },
                        };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z <=2 ; z++)
                    System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + arr[i][j][z]);
        System.out.println("---------------");

    }
}
