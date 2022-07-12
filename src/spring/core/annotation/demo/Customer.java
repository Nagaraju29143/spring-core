package spring.core.annotation.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@Controller
//@Service
//@Repository

@PropertySource("classpath:database.properties")
public class Customer {
	
	@Autowired	
	private CustomerBasicDetails basicDetails;
	
	@Resource
	@Qualifier("perminent")
	private CustomerAddress address;
	
	@Value("${db.postgre.url}")
	private String postgredbUrl;
	
	public String getPostgredbUrl() {
	    return postgredbUrl;
	  }
	
	
	 public Customer(){
		
	}
	//for constructor injection
	 
	
	
   public Customer(CustomerBasicDetails basicDetails,  CustomerAddress address) {
		System.out.println("Customer Bean Instantiated using parameterized constructor");
		this.basicDetails = basicDetails;
		this.address = address;
	}
	
	//for setter injection
	
	public void setBasicDetails(CustomerBasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}
	
	
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Customer [basicDetails=" + basicDetails + ", address=" + address + "]";
	}
	 
	/*@PropertySource("classpath:database.properties")
	
	@Value("${db.postgre.url}")
	private String postgredbUrl;
	
	public String getPostgredbUrl() {
	    return postgredbUrl;
	  }*/

}
