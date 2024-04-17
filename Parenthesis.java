package collections;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k="";
		Stack<Character> list=new Stack<>();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='{' || s.charAt(i)=='(' ||s.charAt(i)=='[') {
				list.push(s.charAt(i));
			}
			else if((s.charAt(i)==')' && list.peek()=='(') 
					|| (s.charAt(i)=='}' && list.peek()=='{') 
					|| (s.charAt(i)==']' && list.peek()=='[') ) {
				k+=s.charAt(i);
				list.pop();
			}
			else {
				list.clear();
			}
		}
		System.out.println(k);
		System.out.println("Valid");
		
	}

}
