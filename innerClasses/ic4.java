/* Create java application where we have one class, it contains one method with 
parameter and return type, inside this class, we have another class that is static, here 
also we have one method with parameter and return type then invoke these two 
methods under the main by providing dynamic inputs. (class ic4)*/
package innerClasses;

import java.util.Scanner;

public class ic4 {
	static Scanner sc=new Scanner(System.in);
	float m1(int a) {
		System.out.println(a);
		return sc.nextFloat();
	}
	static class ic40{
		boolean m2(char c) {
			System.out.println(c);
			return sc.nextBoolean();
		}
	}
	public static void main(String[] args) {
		ic40 obj=new ic40();
		ic4 obj1=new ic4();
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println(obj1.m1(sc.nextInt()));
	}

}
