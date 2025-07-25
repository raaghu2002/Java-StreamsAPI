package TerminateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
									
									new Employee("Raghavendra", "Development", 45000),
									new Employee("Django Mani", "Development", 46000),
									new Employee("Bharjav", "Development", 47000),
									new Employee("Priya", "HR", 100000),
									new Employee("Srujan", "Testing", 45000),
									new Employee("Yogesh", "Testing", 46000),
									new Employee("Darshan", "Testing", 47000),
									new Employee("Nishanth", "Testing", 48000),
									new Employee("Pramodh", "Business Development", 10000),
									new Employee("Arvindh", "Business Development", 11000)
				
									);
		
		Map<String , List<Employee>> groupedEmployees = employees.stream()
																	.collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(groupedEmployees);
		
		groupedEmployees.forEach((Department , employeeList) -> {
			System.out.println("Department : " + Department);
			employeeList.forEach(System.out::println);
		});
		

	}

}
