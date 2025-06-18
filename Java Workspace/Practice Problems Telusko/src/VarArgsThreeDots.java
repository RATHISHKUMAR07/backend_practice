/*
The three dots ( ... ) are used in a function's declaration as a parameter.
These dots allow zero to multiple arguments to be passed when the function is called.
The three dots are also known as var args .
*/

public class VarArgsThreeDots {
    public static void main(String[] args)
    {
        VarArgs obj = new VarArgs();
        //When we give one variable it search for the exact size of int
        // if it is available it will print in that output otherwise it will search for another options
        obj.show(5);
        obj.show(5,4,6,7,8);

    }

    static class VarArgs
    {
        public void show(int a)
        {
            System.out.println("Num is " + a);
        }
        //in method given same name this is called as overloading method
        public void show(int ... a)
        {
            for(int i : a) //Enhanced for loop
                System.out.print(i +" ");
        }
    }
}
