//9) How to Create Object in Java
package basic.problems;
public class CreateObject
{

	public static void main(String[] args) 
	{
		//creating an object using new keyword   
		Create obj = new Create();   
		//invoking method using the object  
		obj.show();  	
	}
}
class Create
{    
	void show()    
	{    
		System.out.println("Welcome to New Object");    
	}    
}