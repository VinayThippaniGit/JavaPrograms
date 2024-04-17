/*•	Create a java application where we have one class it contains methods like
m1 having parameter integer returns a string value, 
method m2 having parameter Boolean returns m1 return value, 
method m3 having parameter float return Boolean value, 
method m4 having parameter char returns m3 return value, 
then invoke m2 and m4 under main method by providing dynamic inputs. (class H8)*/
package methods;
import java.util.Scanner;
public class H8 {
	static H8 obj=new H8();
	static Scanner sc=new Scanner(System.in);
		String m1(int a) {
			return sc.next();
		}
		String m2(boolean b) {
			String a=obj.m1(sc.nextInt());
			return a;
		}
		boolean m3(float f) {
			return sc.nextBoolean();
		}
		boolean m4(char c) {
			boolean b=obj.m3(sc.nextFloat());
			return b;
		}
		public static void main(String[] args) {
			System.out.println(obj.m2(sc.nextBoolean()));
			System.out.println(obj.m4(sc.next().charAt(0)));
	}
}
