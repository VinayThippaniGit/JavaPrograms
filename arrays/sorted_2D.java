package arrays;

import java.util.Scanner;

public class sorted_2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int r=sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int c=sc.nextInt();
		System.out.print("Enter the Array Elements : ");
		int s[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				s[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(int a=0;a<r;a++) {
					for(int b=0;b<c;b++) {
						if(s[i][j]<s[a][b]) {
							int temp=s[i][j];
							s[i][j]=s[a][b];
							s[a][b]=temp;
						}
					}
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}

}
