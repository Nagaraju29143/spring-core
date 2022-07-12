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
		
		System.out.println(Arrays.toString(marks));
		
		List names=collectionBean.getNames();
		System.out.println(names);
		
		
		
		Set phones=collectionBean.getPhones();
		System.out.println(phones);
		
		Map capitals=collectionBean.getCapitals();
		System.out.println(capitals);
		
		Properties faculty=collectionBean.getFaculties();
		System.out.println(faculty);
		
	}

}
