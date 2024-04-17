/*Create a Java application where we have one abstract class it contains one abstract 
method, one defined method, and one parameterised constructor. we also have one 
separate interface it contains one abstract method and one defined method then, 
provide the implementation for both abstract class and interface by using anonymous 
inner classes in another class test by providing dynamic inputs. (class ic6)*/
package innerClasses;
import java.util.Scanner;
abstract class a6{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(char c);
	int m2(boolean b) {
		System.out.println(b);
		return sc.nextInt();
	}
	a6(float f){
		System.out.println(f);
	}
}
interface i6{
	String m3(char d);
	default double m4(float e) {
		System.out.println(e);
		return a6.sc.nextDouble();
	}
}
public class ic6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 a6 obj=new a6(a6.sc.nextFloat()){
			int m1(char c) {
				System.out.println(c);
				return sc.nextInt();
			}
		};
		System.out.println(obj.m2(a6.sc.nextBoolean()));
		System.out.println(obj.m1(a6.sc.next().charAt(0)));
		i6 obj2=new i6() {
			public String m3(char d) {
				System.out.println(d);
				return a6.sc.next();
			}
		};
		System.out.println(obj2.m3(a6.sc.next().charAt(0)));
		System.out.println(obj2.m4(a6.sc.nextFloat()));
	}
}
