package arrays;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		//int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			//if(a[i]>max) {
				//max=a[i];
			//}
		}
		int nth=3;
		
		int max=Integer.MAX_VALUE;
		for(int j=1;j<=nth;j++) {
			int m=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				if(a[i]>m && a[i]<max) {
					m=a[i];
				}
			}
			max=m;
		}
		System.out.println(max);
		/*
		for(int i=0;i<n;i++) {
			int m=Integer.MIN_VALUE;
			if(a[i]>m && a[i]<max) {
				m=a[i];
			}
			max=m;
			System.out.println(max+" ");
		}*/
	}
}
