package com.vinay;
import java.util.Scanner;
public class KTimesNum {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int a[]=new int[n];
		        for(int i=0;i<n;i++)
		        {
		            a[i]=sc.nextInt();
		        }
		        int k=sc.nextInt();
		        if(k>0)
		        {
		            for(int i=0;i<n;i++)
		            {
		                int c=0;
		                for(int j=0;j<i;j++)
		                {
		                    if(a[i]==a[j])
		                    {
		                        c++;
		                    }
		                }
		                if(c==0)
		                {
		                    for(int j=0;j<n;j++)
		                    {
		                        if(a[i]==a[j])
		                        {
		                            c++;
		                        }
		                    }
		                    if(c==k)
		                    {
		                    System.out.print(a[i]+" ");
		                     }
		                }
		                
		            }
		        }
		        else
		        {
		            System.out.print("Invalid Kth Value");
		        }
		    }
}
