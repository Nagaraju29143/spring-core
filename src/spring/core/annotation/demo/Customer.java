package spring.core.annotation.demo;

import javax.annotation.Resource;

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
	
	//@Autowired	//defualt byType mode
	 @Resource
	private CustomerBasicDetails basicDetails;
	
	/* @Autowired        //byType>byQualifier>byName
	 @Qualifier("perminent")*/
	@Resource
	@Qualifier("cur") //byName>byType>byQualifier
	private CustomerAddress address;
	
	
	@Value("${db.postgre.url}")
	private String postgredbUrl;
	
	public String getPostgredbUrl() {
	    return postgredbUrl;
	  }
	
	
	 public Customer(){
		
	}
	//for constructor injection
	 
	
	//@Autowired
  // public Customer(CustomerBasicDetails basicDetails, @Qualifier("perminent") CustomerAddress address) {
	 public Customer(CustomerBasicDetails basicDetails, CustomerAddress address) {
		System.out.println("Customer Bean Instantiated using parameterized constructor");
		this.basicDetails = basicDetails;
		this.address = address;
	}
	
	//for setter injection
   // @Autowired
   public void setBasicDetails(CustomerBasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}
	
   // @Autowired
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Customer [basicDetails=" + basicDetails + ", address=" + address + "]";
	}
	 
	

}
