
public class EncapsulationExample 
{
	public static void main(String[] args) 
	{
		Emp obj = new Emp();
		obj.setEmpId(5);
		obj.setEmpName("rathish");
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpId());
	}
}

class Emp
{
	private int empId;
	private String empName;
	
	public void setEmpId(int i)
	{
		this.empId = i;
	}
	public void setEmpName(String j)
	{
		this.empName = j;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	
}
