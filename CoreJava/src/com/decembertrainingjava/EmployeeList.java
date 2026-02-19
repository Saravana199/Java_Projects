package com.decembertrainingjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Shruti", 34));
		emp.add(new Employee(2, "Sam",45));
		emp.add(new Employee(3, "gopi",52));
		

Collections.sort(emp, Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Sorted by Salary (Ascending):");
        for (Employee e : emp) {
            System.out.println(e);
        }

        // Highest and Lowest salary
        Employee lowest = emp.get(0);
        Employee highest = emp.get(emp.size() - 1);

        System.out.println("\nLowest Salary: " + lowest.getName() + " = " + lowest.getSalary());
        System.out.println("Highest Salary: " + highest.getName() + " = " + highest.getSalary());

		
	}

}
