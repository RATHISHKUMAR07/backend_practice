
public class StaticDefaultInterfaces 
{
	public static void main(String[] args) 
	{
		DefaultMethods dm = new DefaultMethods();  
		dm.say();   // calling default method  
	    dm.sayMore("Abstract");  // calling abstract method 
	    
	    Y.show();//Calling Static method
	}

}
class DefaultMethods implements X
{
	 public void sayMore(String msg)
	 {  // implementing abstract method   
	        System.out.println(msg);  
	 }
}
interface X
{
	//By using default keyword we can define a method in interface
	// Default method   
    default void say(){  
        System.out.println("default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
	
interface Y
{
	//By using static keyword we can define a method in interface
	//Static method is very powerful 
	//So we simply call this in main function without creating object 
	//Interface name A.show()
	static void show()
	{
		System.out.println("Static");
	}
}