package spring.core.annotation.demo;

public class CustomerAddress {
	private String city;
	private String state;
	private int pinCode;
	
	
	public CustomerAddress(){
		
	}
	public CustomerAddress(String city, String state, int pinCode) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "[city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}
	
	

}
