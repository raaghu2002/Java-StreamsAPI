package TerminateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

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
		
		Map<Boolean , List<Employee>> partitionEmployees = employees.stream()
																		.collect(Collectors.partitioningBy(employee -> (employee.getSalary()>(45000))));
		
		System.out.println("Employee Salary grater then 45000#");
		partitionEmployees.get(true).forEach(System.out::println);
		
		System.out.println("Employee Salary less or equal to then 45000#");
		partitionEmployees.get(false).forEach(System.out::println);

	}

}
