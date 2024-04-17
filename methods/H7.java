/*Create a java application where we have one class it contains
a non-static method named m1 having parameter integer returns 
a Boolean value, 
static method m2 having parameter long returns a double value, 
non-static method m3 having parameter string returns a character value 
then invoke m1 under m2, m2 under m3 and m3 under main by providing 
dynamic inputs for both parameter and return type. (class H7)*/
package methods;
import java.util.Scanner;
public class H7 {
	static H7 obj=new H7();
	static Scanner sc=new Scanner(System.in);
	boolean m1(int a) {
		System.out.println(a);
		return sc.nextBoolean();
	}
	static double m2(long l) {
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(l);
		return sc.nextDouble();
	}
	char m3(String s) {
		System.out.println(m2(sc.nextLong()));
		System.out.println(s);
		return sc.next().charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(obj.m3(sc.next()));
	}
}
