/*Create a java application where we have a software company it will provide details like 
employee id, employee name, employee designation, employee salary to five different 
employees. Every employee has to display their own details with respective to one 
userdefined method and then invoke all those methods under main. (class ih1)*/
package inheritance;
import java.util.Scanner;
class EmpDetails{
	Scanner sc=new Scanner(System.in);
	int empid;
	String name;
	String Des;
	Float salary;
	{
		System.out.print("Enter employee id : ");
		empid=sc.nextInt();
		System.out.print("Enter employee name : ");
		name=sc.next();
		System.out.print("Enter employee designation : ");
		Des=sc.next();
		System.out.print("Enter employee salary : ");
		salary=sc.nextFloat();
	}
}
public class ih1 extends EmpDetails{
	static int emp=1;
	void display(){
		System.out.println("ID : "+empid);
		System.out.println("NAME : "+name);
		System.out.println("DESIGNATION : "+Des);
		System.out.println("SALARY : "+salary);
	}
	public static void main(String[] args) {
		ih1 emp1=new ih1();
		emp1.display();
		ih1 emp2=new ih1();
		emp2.display();
		ih1 emp3=new ih1();
		emp3.display();
		emp1.display();
	}
}