package com.vinay;

import java.util.Scanner;

public class LCM {
	// 2468134--24
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int temp = n;
		
		
		
		/*int max = Integer.MIN_VALUE;
		int max2=max;
		while (temp > 0) {
			int r = temp % 10;
			if (r % 2 == 0 && r!=0) {
				if (r > max) {
					max = r;
				}
			}
			count++;
			temp/=10;
		}
		if(count<4) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		temp=n;
		while (temp > 0) {
			int r = temp % 10;
			if (r % 2 == 0 && r!=0) {
				if (r > max2 && r!=max) {
					max2 = r;
				}
			}
			temp/=10;
		}
		for(int i=max;i<=max*max2;i++) {
			if(i%max==0 && i%max2==0) {
				System.out.println(i);
				System.exit(0);
			}
		}*/
	}

}
