package arrays;

import java.util.Scanner;

public class Equations {
	//x+2y+z=1, x-2y+3z=0; x+2y=2
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int det=(a[0][0]*det(a,0,0))-(a[0][1]*det(a,0,1))+(a[0][2]*det(a,0,2));
		int detMatrix[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				detMatrix[i][j]=det(a,i,j);
			}
		}
		int adj[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				adj[j][i]=detMatrix[i][j];
			}
		}
		int Inverse[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				int e=adj[i][j];
				if((i+j)%2!=0) {
					e=-e;
				}
				Inverse[i][j]=e;
						
				//System.out.print(Inverse[i][j]+" ");
			}
			//System.out.println();
		}
		Mul(Inverse,det);
	}
	public static int det(int a[][],int i,int j) {
		int r=a.length;
		int c=a[0].length;
		int place=0;
		int detArray[]=new int[4];
		for(int k=0;k<r;k++) {
			for(int l=0;l<c;l++) {
				if(k!=i && l!=j) {
					detArray[place]=a[k][l];
					place++;
				}
			}
		}
		int det=(detArray[0]*detArray[3])-(detArray[1]*detArray[2]);
		return det;
	}
	public static void Mul(int a[][],int det) {
		int b[][]=new int[3][1];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		mul_matrix(a, b,det);
	}
	public static void mul_matrix(int Matrix1[][],int Matrix2[][],int det) {
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
			}
		}
		//return s3;
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.println(s3[i][j]+"/"+det);
			}
		}
	}
}