/*Create a java application where we have one class it contains a 
 * non-static method named add having two parameter integer 
 * and integer, this method has to return the addition
 *  of two formal parameters, a static method named
 *sub also has two parameters integer and integer,this method
 * has to return the subtraction value of the two formal
 *  parameters, then invoke both the methods under 
 *  main method by providing dynamic inputs. (class H6)
 */
package methods;

import java.util.Scanner;

public class H6 {
	static Scanner sc=new Scanner(System.in);
	int add(int a,int b){
		int c=a+b;
		return c;
	}
	static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		H6 obj=new H6();
		System.out.println(obj.add(sc.nextInt(),sc.nextInt()));
		System.out.println(obj.sub(sc.nextInt(),sc.nextInt()));
	}
}
