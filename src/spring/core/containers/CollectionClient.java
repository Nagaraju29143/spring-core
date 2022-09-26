package spring.core.containers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.beans.CollectionBean;

public class CollectionClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collectionbean.xml");
		
		CollectionBean collectionBean=(CollectionBean)applicationContext.getBean("collectionBean");
		
		int[] marks=collectionBean.getMarks();
		
		System.out.println("Marks: "+Arrays.toString(marks));
		
		List names=collectionBean.getNames();
		System.out.println("Names: "+names);
		
		
		
		Set phones=collectionBean.getPhones();
		System.out.println("PhNos: "+phones);
		
		Map capitals=collectionBean.getCapitals();
		System.out.println("Capitals: "+capitals);
		
		Properties faculty=collectionBean.getFaculties();
		System.out.println("Faculty: "+faculty);
		
	}

}
