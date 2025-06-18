
public class SuperKeyword
{
	public static void main(String[] args)
	{
		super2 obj = new super2();
		obj.keyword();
	}

}
//Final Keyword will not allow
class super1
{
	int i = 5;
}
class super2 extends super1
{
	int i = 4;
	public void keyword()
	{
		System.out.println(i);
		System.out.println("This is super keyword "+super.i);
	}
	
}