package spring.core.beans;

public class Customer {
	private String name;
	private int age;
	private double salary;

	
  public Customer() {
	 System.out.println("Customer Instantiated using default constructor"); 
	 }
	 
	// Constructor Injection
	
	public Customer(String name, int age, double salary) {
		System.out.println("Custommer Instantiated using parametarized constructor");

		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	 
	// Setter Injection

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
