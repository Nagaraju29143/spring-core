package spring.core.annotation.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.core.annotation")
public class AppConfig {
	
	@Bean("cbd")
	CustomerBasicDetails getCustomerBasicDetails() {
		CustomerBasicDetails cbd=new CustomerBasicDetails();
		cbd.setCustName("ram");
		cbd.setPhoneNumber(123456789);
		cbd.setAge(30);
		cbd.setSalary(25567.89);
		
		return cbd;
		
	}
	
	@Bean("current")
	//@Qualifier("current")
	CustomerAddress getCurrentAddress() {
		
		CustomerAddress ca=new CustomerAddress("Hyderabad","Telangana",500032);
		
		return ca;
	}
	
	@Bean("perminent")
	//@Qualifier("perminent")
	CustomerAddress getPerminentAddress() {
		
		CustomerAddress pa=new CustomerAddress("Vizag","Andhrapradesh",535006);
		
		return pa;
	}
	
	

}
