package com.vinay;

public class stringBuffer {
//String builder is same as string buffer but only change is that string builder is not thread safe
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a;
		String s="kjt 5 54v";
		System.out.println(s.substring(2,5));
		System.out.println(s.codePointAt(1));
		System.out.println("helhfv".compareTo("hez"));
		StringBuffer sb=new StringBuffer("java");
		System.out.println("sb capacity "+sb.capacity());
		sb.append("creevnvneovvgfdf");//adds string at the end;
		System.out.println(sb);
		System.out.println("sb capacity "+sb.capacity());
		
		sb.delete(6, 10);
		System.out.println(sb);
		
		System.out.println(sb.deleteCharAt(5));
		StringBuffer sb2=new StringBuffer(5);
		System.out.println("sb2 capacity "+sb2.capacity());//capacity is array size;
		sb2.append("Python"); //if the string length crosses the stringbuffer size then the size will be increased to double of its old size plus 2--(5+5 + 2)=12;
		System.out.println("sb2 capacity "+sb2.capacity());
		sb2.append("python20"); //(12+12+2)=26;
		System.out.println("sb2 capacity "+sb2.capacity());
		sb2.ensureCapacity(5000); //to avoid multiple steps in increasing the size
		System.out.println("sb2 capacity "+sb2.capacity());
		System.out.println("Index of "+sb2.indexOf("hon"));
		System.out.println("Inserting "+sb2.insert(2, 324));//(2--index place) (324 may be boolean or string or char or char array etc..)inserts string at wanted index position;
		System.out.println("Length of sb2 "+sb2.length()); //length of the content
		System.out.println("Reverse "+sb2.reverse());
		System.out.println(sb2.length());
		sb2.setLength(14);  //changes the length to new setted size and gets updated also upto that length;
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		sb2.trimToSize();  //trims the array size to length of the string;
		System.out.println(sb2.capacity());
		sb2.reverse().append("world").append("python");//Method chaining
		System.out.println(sb2);
	}

}
