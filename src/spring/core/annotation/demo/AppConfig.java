package spring.core.annotation.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.core.annotation")
public class AppConfig {
	
	@Bean("bd")
	CustomerBasicDetails getCustomerBasicDetails() {
		CustomerBasicDetails cbd=new CustomerBasicDetails();
		cbd.setCustName("sai");
		cbd.setPhoneNumber(123456789);
		cbd.setAge(30);
		cbd.setSalary(25567.89);
		
		return cbd;
		
	}
	
	@Bean("cur")
	@Qualifier("current")
	CustomerAddress getCurrentAddress() {
		
		CustomerAddress ca=new CustomerAddress("Hyderabad","Telangana",500032);
		
		return ca;
	}
	
	@Bean("per")
	@Qualifier("perminent")
	CustomerAddress getPerminentAddress() {
		
		CustomerAddress pa=new CustomerAddress("Vizag","Andhrapradesh",535006);
		
		return pa;
	}
	
	/*@Bean("customer")
	Customer getCustomer(CustomerBasicDetails bd,CustomerAddress cur) {
		
		Customer cust=new Customer();
		cust.setBasicDetails(bd);
		cust.setAddress(cur);
		
		return cust;
	}*/
	
	

}
