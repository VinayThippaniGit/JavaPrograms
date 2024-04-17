/*Create a java application where we have one class named organization with details like 
employee id, employee name, employee salary, and employee designation and 
organization name, create five new instances for employees there is a method named 
employee details with class variable as parameter. This method returns nothing. This 
method will print all the employee details present in the object. Invoke this method 
under main and while invoking according to the user choice the respective employee 
details should be displayed. Provide dynamic inputs. (class org)*/
package methods;

import java.util.Scanner;

public class org {
	static Scanner sc=new Scanner(System.in);
	String emp_id=sc.next();
	String emp_name=sc.next();
	float emp_salary=sc.nextFloat();
	String emp_designation=sc.next();
	String org_name=sc.next();
	void empDetails(org obj) {
		System.out.println("Employee ID : " +obj.emp_id);
		System.out.println("Employee name : " +obj.emp_name);
		System.out.println("Employee Salary : " +obj.emp_salary);
		System.out.println("Employee Designation : " +obj.emp_designation);
		System.out.println("Organisation Name : " +obj.org_name);
	}
	public static void main(String[] args) {
		org emp1=new org();
		org emp2=new org();
		int n=sc.nextInt();
		switch(n) {
		case 1:
			emp1.empDetails(emp1);
			break;
		case 2:
			emp2.empDetails(emp2);
			break;
		}
	}

}
