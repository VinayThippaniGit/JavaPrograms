package arrays;

import java.util.Scanner;

public class int_least_permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),size=0,temp=n;
		while(temp>0) {
			temp/=10;
			size++;
		}
		temp=n;
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			int r=temp%10;
			a[i]=r;
			temp/=10;
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(a[i]<a[j]) {
					a[i]=a[j]+a[i]-(a[j]=a[i]);
				}
			}
		}
		
		if(a[0]==0) {
			int minInd=0;
			int min2=Integer.MAX_VALUE;
			for(int i=0;i<size;i++) {
				if(a[i]<min2 && a[i]!=0) {
					min2=a[i];
					minInd=i;
				}
			}
			a[0]=a[minInd]+a[0]-(a[minInd]=a[0]);
		}
		int num=0;
		for(int i=0;i<size;i++) {
			num=num*10+a[i];
		}
		System.out.println(num);
	}
}