
public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		addsubmul obj = new addsubmul();
		obj.num1 = 5;
		obj.num2 = 4;
		obj.sum();
		System.out.println("Addition :" + obj.result);
		obj.sub();
		System.out.println("Subtracation :" + obj.result);
		obj.mul();
		System.out.println("Multiplication :" + obj.result);

	}
}
class Add
{
	int num1,num2,result;
	public void sum() 
	{
		result = num1 + num2;
	}
}

class Addsub extends Add
{
	public void sub()
	{
		result = num1 - num2;
	}
}

class addsubmul extends Addsub
{
	public void mul()
	{
		result = num1 * num2;
	}
}