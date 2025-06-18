public class CountNumberOfObjectsCreated {
    public static void main(String[] args)
    {
        A obj = new A();
        A obj1 = new A();
        A obj2 = new A();
        obj.counter();
    }
}
class A
{
    static int i;
    public A()//constructor
    {
        i++;
    }
    public void counter()
    {
        System.out.println(i);
    }
}
