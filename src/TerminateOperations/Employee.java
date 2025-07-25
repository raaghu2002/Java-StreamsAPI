package TerminateOperations;

public class Employee {
	
	String Name;
	String Department;
	Integer Salary;
	
	public Employee(String name , String department , Integer salary) {
		// TODO Auto-generated constructor stub
		this.Name = name;
		this.Department = department;
		this.Salary = salary;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String department) {
		this.Department = department;
	}
	
	public Integer getSalary() {
		return Salary;
	}
	
	public void setSalary(Integer salary) {
		this.Salary = salary;
	}
	
	public String toString() {
		return "Employee{" +
				"Name='" + Name + '\'' +
				", Department='" + Department + '\'' +
				", Salary='" + Salary +
				'}';
	}

}
