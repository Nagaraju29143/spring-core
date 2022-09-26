package spring.core.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	
	int[] marks;
	List names;
	Set phones;
	Map capitals;
	Properties faculties;

	public CollectionBean(){
		
	}
	public CollectionBean(int[] marks, List names, Set phones, Map capitals, Properties faculties) {
		System.out.println("CollectionBean Instantiated using parametarized constructor");
		this.marks = marks;
		this.names = names;
		this.phones = phones;
		this.capitals = capitals;
		this.faculties = faculties;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public int[] getMarks() {
		return marks;
	}

	public List getNames() {
		return names;
	}

	public void setNames(List names) {
		this.names = names;
	}

	public Set getPhones() {
		return phones;
	}

	public void setPhones(Set phones) {
		this.phones = phones;
	}

	public Map getCapitals() {
		return capitals;
	}

	public void setCapitals(Map capitals) {
		this.capitals = capitals;
	}

	public Properties getFaculties() {
		return faculties;
	}

	public void setFaculties(Properties faculties) {
		this.faculties = faculties;
	}
	

}
