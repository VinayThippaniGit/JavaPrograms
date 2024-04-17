package com.vinay;

public class Month1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Month.jan);  //op: jan
		Month x=Month.jan;
		System.out.println(x);
		System.out.println("x==jan : "+ (x==Month.jan));
	}

}
enum Month{
	jan,feb;
}