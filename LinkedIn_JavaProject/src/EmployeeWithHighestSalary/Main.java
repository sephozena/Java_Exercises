package EmployeeWithHighestSalary;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee("Joseph", 1500000);
		
		employees.add(emp1);
		employees.add(new Employee("seph", 170000));
		employees.add(new Employee("jo", 300000));
		employees.add(new Employee("jo2", 122000));
		employees.add(new Employee("jos", 100000));
		employees.add(new Employee("jos", 300000));




		Employee highestSalaryEmployee = employees.get(0);
		
		for (Employee emp : employees) {
			if (emp.getSalary() > highestSalaryEmployee.getSalary()) {
				highestSalaryEmployee = emp;
			}
		}
		
		
		final int salary = 100000;
		List <String> newEmp = new ArrayList<>();
		
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getSalary() >= salary && employees.get(i).getSalary() == salary*3) {
				newEmp.add(employees.get(i).getName() +" "+ employees.get(i).getSalary());
			}
		}
		
		for(Employee emp: employees) {
			if(emp.getSalary() >= salary && emp.getSalary() == 300000) {
				System.out.println(emp.getName() + " " +emp.getSalary());	
			}
		}
		
		for(int i=0; i < newEmp.size(); i++){
			System.out.println("employee with salary greater than 100k:" + newEmp.get(i) + " \n***");
		}
		System.out.println("employee with highest salary :" + highestSalaryEmployee.getName() +" "+ highestSalaryEmployee.getSalary());
		}
		
	}
