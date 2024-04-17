/* Create a java application where we have one class, it contains one method with 
parameter and return type, inside this class we have another class it contains one more 
method with parameter and return type, inside this method we have two inner classes 
with respect to individual methods with parameters and return types. Then invoke all 
these methods under the main method by providing dynamic inputs. (class ic3)*/
package innerClasses;

import java.util.Scanner;

public class ic3 {
	static Scanner sc=new Scanner(System.in);
	boolean m1(int a) {
		System.out.println(a);
		return sc.nextBoolean();
	}
	class ic31{
		float m2(boolean b) {
			System.out.println(b);
			class ic311{
				String m3(char c) {
					System.out.println(c);
					return sc.next();
				}
			}
			class ic312{
				int m4(double d) {
					System.out.println(d);
					return sc.nextInt();
				}
			}
			ic311 obj1=new ic311();
			System.out.println(obj1.m3(sc.next().charAt(0)));
			ic312 obj2=new ic312();
			System.out.println(obj2.m4(sc.nextDouble()));
			return sc.nextFloat();
		}
	}
	public static void main(String[] args) {
		ic3 obj=new ic3();
		ic3.ic31 obj4=obj.new ic31();
		System.out.println(obj4.m2(sc.nextBoolean()));
		System.out.println(obj.m1(sc.nextInt()));
	}

}
