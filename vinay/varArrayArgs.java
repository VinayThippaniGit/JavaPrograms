package com.vinay;

public class varArrayArgs {
	//public static void main(String[] args)
	//static public void main(String[] args)(Brackets can be placed anywhere)
	public static void main(String []args) {
		add(45,45);
		add(67,33);
		main();
		varArrayArgs s[]=new varArrayArgs[6];
		obj(s,new varArrayArgs());
		add(1,2,3,4,5);
	}
	public static void main() {
		System.out.println("no arg main method.");
	}
	static void obj(Object... ar) {
		
	}
	static void add(int... data) {
		int sum=0;
		for(int i:data) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
