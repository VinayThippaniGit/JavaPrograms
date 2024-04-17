/*•	Create a java application where we have one class it contains a 
 non-static method m1 having parameter integer return a string value,
 then invoke this method under main method by providing dynamic inputs
 for both parameter and return type without using import statements. (class H9)*/
package methods;
public class H9 {
	static H9 obj=new H9();
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	String m1(int a) {
		return sc.next();
	}
	
	public static void main(String[] args) {
		System.out.println(obj.m1(sc.nextInt()));
	}
}
