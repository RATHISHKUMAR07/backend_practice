
public class LambdaInterface 
{
	public static void main(String[] args)
	{
		bc obj = ()->System.out.println("In show");//This called as lambda expressions
		obj.show();
	}

}
/*
 * There are 3 Interfaces
 * Marker interface --> without methods ....1
 * SAM -> Single Abstract Method(only one method can be used) ....2
 * SAM ->In java 8 called as Functional Interface
 * Normal ....3
 */
interface bc
{
	void show();
}