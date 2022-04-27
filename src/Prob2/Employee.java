package Prob2;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		getAnnualSalary(this.salary);
		raiseSalary(25);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void getAnnualSalary(int salary) {
		this.salary = salary*12;
	}
	public int raiseSalary(int percent) {
		int sal=(int)(this.salary *percent/100);
		this.salary=sal + this.salary;
		return this.salary ;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + firstName + lastName + ", salary=" + salary
				+ "]";
	}

}