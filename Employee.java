 package java8program;

public class Employee {

	private String id;
	private String name;
	private Integer salary;
	
	public Employee(String id, String name, Integer salary) {
		
		this.id = id;
	
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	
}
