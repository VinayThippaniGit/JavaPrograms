/*Create a java application where we have one class it contains a non-static method 
named m1 having parameter String returns integer, static method m2 having parameter 
Boolean returns integer, then invoke m1 method under m2 and m2 has to return the 
integer value in addition to m1 return value, invoke m2 under main method by providing
 dynamic inputs. (class S)*/
package methods;
import java.util.Scanner;
public class S {
	static S obj=new S();
	static Scanner sc=new Scanner(System.in);
	int m1(String s) {
		return sc.nextInt();
	}
	static int m2(boolean b) {
		int a=obj.m1(sc.next());
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m2(sc.nextBoolean()));
	}
}
