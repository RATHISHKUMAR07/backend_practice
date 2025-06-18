import java.util.*;
public class TablesInLoops {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();
        num.close();
        for(int a = 1;a<=10 ; a++){
            int ans = i * a;
            System.out.println(""+ i +" X "+ a +" = "+ ans +"");
        }
    }
}
