/* Create a Java application where we have one interface, which contains two abstract 
methods then provide an implementation for this interface by using an anonymous 
inner class and then invoke all these methods under main by providing dynamic inputs.
(class ic5)*/
package innerClasses;

import java.util.Scanner;

interface i5{
	int m1(char c);
	char m2(int a);
}
public class ic5{
	static Scanner sc=new Scanner(System.in);
	/*class ic50 implements i5{
		public int m1(char b) {
			return 10;
		}
	}*/

	public static void main(String[] args) {
		i5 obj=new i5() {
			public int m1(char b) {
				return 10;
			}
			public char m2(int a) {
				return 'c';
			}
		};
		System.out.println(obj.m1('a'));
		System.out.println(obj.m2(11));
	}
}
