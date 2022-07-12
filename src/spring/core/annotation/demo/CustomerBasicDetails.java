package spring.core.annotation.demo;

public class CustomerBasicDetails {
	private String custName;
	private long phoneNumber;
	private int age;
	private double salary;
	
	public CustomerBasicDetails(){
		
	}
	
	public CustomerBasicDetails(String custName, long phoneNumber, int age, double salary) {
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.salary = salary;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[custName=" + custName + ", phoneNumber="
				+ phoneNumber + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
