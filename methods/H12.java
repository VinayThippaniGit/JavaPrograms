/*•	Create a java application where we have one static and one instance variable,
 *  a static and non-static method with parameter and return type then invoke all
 *   the properties under main by providing dynamic inputs. (class H12)*/
 package methods;

import java.util.Scanner;

public class H12 {
		static Scanner sc=new Scanner(System.in);
		static int a=sc.nextInt();
		int b=sc.nextInt();
		static String m1(String c) {
			System.out.println(c);
			return sc.next();
		}
		String m2(String a) {
			System.out.println(a);
			return sc.next();
		}
		public static void main(String[] args) {
			H12 obj=new H12();
			System.out.println(sc.next().charAt(0));
			System.out.println(a);
			System.out.println(obj.b);	
			System.out.println(m1(sc.next()));
			System.out.println(obj.m2(sc.next()));
				
	}
}
