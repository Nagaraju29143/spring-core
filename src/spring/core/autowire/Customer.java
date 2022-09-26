package spring.core.autowire;

public class Customer {
	private int custId;
	private CustomerBasicDetails basicDetails;
	private CustomerAddress address;
	
	
	
	  public Customer() {
	  
	  }
	 
	//for constructor injection

	
	  public Customer(int custId, CustomerBasicDetails basicDetails,CustomerAddress
	  address) { System.out.
	  println("Customer Bean Instantiated using parameterized constructor");
	  this.custId = custId; this.basicDetails = basicDetails; this.address =
	  address; }
	 
	
	//for setter injection
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setBasicDetails(CustomerBasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}
	 
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", basicDetails=" + basicDetails
				+ ", address=" + address + "]";
	}
	
	

}
