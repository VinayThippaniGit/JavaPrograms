/*Create a java application where we have one employee they have to display details like 
employee id, name, salary, designation and mobile number by using a parameterized 
constructor then invoke this constructor under main method by providing dynamic 
inputs. (class c4)*/
package constructors;
import java.util.Scanner;
public class C4 {
	C4(int emp_id,String name,float salary,String designation,long mbl){
		System.out.println(emp_id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println(mbl);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		new C4(sc.nextInt(),sc.next(),sc.nextFloat(),sc.next(),sc.nextLong());
	}
}
