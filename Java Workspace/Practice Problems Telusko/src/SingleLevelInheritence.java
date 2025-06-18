
public class SingleLevelInheritence 
{
	public static void main(String[] args)
	{
		Addsub1 obj = new Addsub1();
		obj.num1 = 5;
		obj.num2 = 4;
		obj.sub();
		System.out.println(obj.result);
		obj.sum();
		System.out.println(obj.result);
	}
}
class Add1
{
	int num1,num2,result;
	public void sum() 
	{
		result = num1 + num2;
	}
}

class Addsub1 extends Add1
{
	public void sub()
	{
		result = num1 - num2;
	}
}