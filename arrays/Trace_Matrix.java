//tracing of matrix is sum of main diagonal elements
package arrays;

import java.util.Scanner;

public class Trace_Matrix {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
