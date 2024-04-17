/* Create a java application where we have one class that contains one method with 
parameter and return type, inside this method we have one inner class which contains 
two methods with parameters and return types then invoke all these methods by 
providing Dynamic inputs. (class ic2)*/
package innerClasses;

import java.util.Scanner;

public class ic2 {
	static Scanner sc=new Scanner(System.in);
	int m1(String s) {
		System.out.println(s);
		class ic20{
			char m2(float f) {
				System.out.println(f);
				return sc.next().charAt(0);
			}
			double m3(boolean b) {
				System.out.println(b);
				return sc.nextDouble();
			}
		}
		ic20 obj1=new ic20();
		System.out.println(obj1.m2(sc.nextFloat()));
		System.out.println(obj1.m3(sc.nextBoolean()));
		return sc.nextInt();
	}
	public static void main(String[] args) {
		ic2 obj=new ic2();
		obj.m1(sc.next());
	}

}
