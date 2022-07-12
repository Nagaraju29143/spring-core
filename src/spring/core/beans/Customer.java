package spring.core.beans;

public class Customer {
	String name;
	int age;
	double salary;

	
    public Customer() {
	 System.out.println("Custommer Instantiated using default constructor"); 
	 }
	 
	 
	// Constructor Injection
	
	  public Customer(String name, int age, double salary) {
	  System.out.println("Custommer Instantiated using parametarized constructor");
	  
	  this.name = name; this.age = age; this.salary = salary; 
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



	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
