package day4;

public class Employee {

	
	private String employee_id;
	private String employee_name;
	private String salary;

	
	public String getEmployeeID()
	{
		return employee_id;
	}
	public void setEmployeeID (String newID) 
	{
		this.employee_id= newID;
	}
	public String getEmployeeName()
	{
		return employee_name;
	}
	public void setEmployeeName (String newName) 
	{
		this.employee_name= newName;
	}
	public String setSalary() 
	{
		return salary;
	}
	public void getSalary (String newSalary)
	{
		this.salary = newSalary;
	}
	
}