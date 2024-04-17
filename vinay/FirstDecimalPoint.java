package com.vinay;

import java.util.Scanner;

public class FirstDecimalPoint {
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        float f=sc.nextFloat();
	        String s=Float.toString(f);
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)=='.') {
	        		System.out.println(s.charAt(i+1));
	        	}
	        }
	        if(f==0)
	        {
	            System.out.print("Zero.");
	        }
	        else
	        {
	            if(f<0)
	            {
	                f=f*(-1);
	            }
	            float a=f*10;
	            int v=(int)a;
	            v%=10;
	            System.out.print(v);
	        }
	    }
}
