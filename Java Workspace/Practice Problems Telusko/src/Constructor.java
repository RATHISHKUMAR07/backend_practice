public class Constructor {
    public static void main(String[] args)
    {
        //creating object for the class
        Abc obj  = new Abc(1,1.1); //Abc() --> This is Constructor //Abc --> This is class

    }
    static class Abc
    {
        //If the class is same like Abc() --> it is called as constructor overloading
        public Abc()//This line is constructor //it will be same as class name "Abc"
        {
            System.out.println("In Abc Const");
        }
        public Abc(int a)//this is parameterized constructor
        {
            System.out.println(a);
        }
        public Abc(int a,double b)//this is parameterized constructor
        {
            System.out.println(a+"-"+b);
        }
    }
}
