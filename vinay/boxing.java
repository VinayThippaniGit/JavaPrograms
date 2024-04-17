package com.vinay;

public class boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		System.out.println(Byte.valueOf(a)); //method boxing
		
		//****.valueOf()  (boxing)
		Byte b1=new Byte(a);       			//constructor boxing
		System.out.println(b1);//Byte type(Object)
		//here b1 is object reference ,we know obj references will print some adress,
		//but most of the wrapper classes override toString() methods , hence they print content(value) that is passed
		
		Byte b2=new Byte("20");
		//object.****Value() (unboxing)
		System.out.println(b1.byteValue());//byte type(Primitive)
		
		
		//Auto boxing
		int i=30;
		Integer iobj=new Integer(i);
		Integer i1=i;  //Integer.valueOf(i)
		//Integer i3=Integer.valueOf(i);  //normal boxing
		
		//Auto unboxing
		int i2=iobj;  //i1.intValue();
		//int i4=iobj.intValue(); //normal
		
		
		
	}

}
