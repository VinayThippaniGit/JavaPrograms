package arrays;

import java.util.ArrayList;

public class arrayList {
	int y=10;
	static ArrayList<String> names=new ArrayList<String>();
	//String k="k";
	//names.add(x);
	public static void main(String[] args) {
		B o=new B();
		o.start();
		//o.m1();
		names.add("vinay");//adds an element
		names.add("ma");
		for(String x:names) {
			System.out.print(x+" ");
		}
		names.set(1,"Mamatha");
		System.out.println();
		for(String x:names) {
			System.out.print(x+" ");
		}
		System.out.println();
		names.remove(0);
		names.add("vinay");
		for(String x:names) {
			System.out.print(x+" ");
		}
		System.out.println();
		names.clear();
		for(String x:names) {
			System.out.print(x+" ");
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
	}
	
}