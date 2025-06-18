public class StaticKeyword {
    public static void main(String[] args)
    {
        abc obj = new abc();
        obj.show();
        abc.i = 5;
        abc.show1();
    }
}
class abc {
    public void show()//When we don't use static in method we have to create object to call the method
    {
        System.out.println("This is Non static method");
    }
    static int i;
    public static void show1()//When we use static in method no need to create object to call the method
    {
        System.out.println("This is static method");
        System.out.println(i);

    }
}