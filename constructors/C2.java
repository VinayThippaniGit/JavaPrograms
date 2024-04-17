/* Create a java application where we have one class it contains one 
parameterized constructor with parameter string, it has to print the 
value of the string while we invoke this constructor under main method 
by providing dynamic inputs. (class c2)*/
package constructors;

import java.util.Scanner;

public class C2 {
	static Scanner sc=new Scanner(System.in);
	C2(String a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		new C2(sc.next());
	}

}
