public class TernaryOperator {
    public static void main(String[] args) {

        /*
        int i = 1;
        String j = i == 1 ? "True" : "False"; //Condition is true,so it will print "True"
        System.out.println(j);

        String j1 = i == 0 ? "True" : "False";//Condition is false,so it will print "False"
        System.out.println(j1);
        */

        /*
        Object obj1,obj2;
        if(true){
            obj1 = new Integer(10);
        }
        else{
            obj1 = new Double(15.0);
        }
        System.out.println(obj1);

        obj2 = true?new Integer(10):new Double(15.0);
        */


        //Find greater than using three numbers
        int n1 = 5, n2 = 10, n3 = 1, max;
        // Largest among n1, n2 and n3
        max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        // Print the largest number
        System.out.println("Largest number among " + n1 +", " + n2 + " and " + n3 +" is " + max + ". " );
    }
}
