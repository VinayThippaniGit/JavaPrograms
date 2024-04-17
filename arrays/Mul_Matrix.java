package arrays;

import java.util.Scanner;

public class Mul_Matrix {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Matrix A");
		int Matrix1[][]=inputs();
		System.out.println("Matrix B");
		int Matrix2[][]=inputs();
		mul_matrix(Matrix1,Matrix2);
		System.out.println();
		mul_matrix(Matrix2,Matrix1);
	}
	public static int[][] inputs() {
		System.out.print("Enter Rows : ");
		int r=sc.nextInt();
		System.out.print("Enter Columns : ");
		int c=sc.nextInt();
		System.out.println("Enter Matrix Elements");
		int Matrix[][]= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				Matrix[i][j]=sc.nextInt();
			}
		}
		return Matrix;
	}
	public static int[][] mul_matrix(int Matrix1[][],int Matrix2[][]) {
		int r1=Matrix1.length;
		int c1=Matrix1[0].length;
		int r2=Matrix2.length;
		int c2=Matrix2[0].length;
		int s3[][]=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				s3[i][j]=0;
				for(int a=0;a<c1 || a<r2;a++) {
					s3[i][j]=s3[i][j]+(Matrix1[i][a]*Matrix2[a][j]);
				}
				System.out.print(s3[i][j]+" ");
			}
			System.out.println(  );
		}
		return s3;
	}

}
