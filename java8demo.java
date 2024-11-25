package java8program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java8demo {

	public static void main(String []args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("1", "vicky",1000));
		empList.add(new Employee("2", "mani",1500));
		empList.add(new Employee("3", "kevin",2000));
		empList.add(new Employee("4", "rangan",2500));
		empList.add(new Employee("5", "kabilan",3000));
		empList.add(new Employee("6", "rose",3500));
		
	    List<Employee> empSortedList = empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
	    		.skip(3)
	    		.collect(Collectors.toList());
	     
	    System.out.println(empSortedList);
	
	}
	
	
}
