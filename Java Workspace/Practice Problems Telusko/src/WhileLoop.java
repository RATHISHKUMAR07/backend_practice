public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        int j = 1;
        // While loop --> First check the condition then executes
        // Do-While loop --> First executes then check the condition
        while(i > 0) // Till condition is true it will print when the cond is false it exists the loop
        {
            System.out.print(i +" ");
            --i;
        }
        System.out.println();
        while(j  <= 10)
        {
            System.out.print(j +" ");
            j++;
        }
    }
}
