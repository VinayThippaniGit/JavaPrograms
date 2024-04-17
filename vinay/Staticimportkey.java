package com.vinay;
import static java.lang.Math.*;

import methods.H10;
import static methods.H10.*;
//the static import is to access the static context in the classes belonging to that pacakges;
import static com.vinay.Names_pattern.*;
public class Staticimportkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(Names_pattern.n);//without static import we can access by using its class name,but its package shoulb be imported,here the two classes are in same package so i havent used imported package
		System.out.println(n);
		
		System.out.println(H10.x);//they should be public
		System.out.println(x);
		
		System.out.println(H10.m2(46.6));
		System.out.println(m2(55.23));
	}

}
