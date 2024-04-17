package com.vinay;
//parsing accepts strings as input and converts them into nemeric form
//if the String contains non numeric content it will raise NumberFormatException
//All parsing methods are static,so they should be called with class name.
public class Parsing {

	public static void main(String[] args) {
		String s="108";
		
		System.out.println(Integer.parseInt(s));
		
		System.out.println(Long.parseLong(s));
		
		System.out.println(Float.parseFloat(s));
		
		System.out.println(Boolean.parseBoolean("t"));
	}

}
