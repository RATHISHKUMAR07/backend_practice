public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do
        {
            System.out.print(i+" ");
            i++;
        }while(i<11);

        System.out.println();
        // Do-While loop --> First executes then check the condition
        int j = 15;
        do
        {
            System.out.println(j);
            j++;
        }while(j<10);
    }
}
