package arrays;

import java.util.Scanner;

public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[2][3];
		for(int i=0;i<a[0].length;i++) {
			a[0][i]=sc.nextInt();
			a[1][i]=sc.nextInt();
		}
		for(int i=0;i<a[0].length;i++) {
			System.out.print(a[0][i]);
		}
		for(int i=0;i<a[1].length;i++) {
			System.out.print(a[1][i]);
		}
	}

}
