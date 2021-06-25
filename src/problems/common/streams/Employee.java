package problems.common.streams;

public class Employee {

	String name;
	int id;
	int salary;
	boolean isActive;
	String department;
	public Employee(String name, int id, int salary, boolean isActive, String department){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.isActive = isActive;
		this.department = department;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", isActive=" + isActive
				+ ", department=" + department + "]";
	}
	
}
