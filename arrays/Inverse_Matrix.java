/* Input
 *  1 2 3
	0 1 4
	0 0 1
	Output	  
	1 -2 5 
	0 1 -4 
	0 0 1 */
package arrays;
//import methods.*;
import java.util.Scanner;

public class Inverse_Matrix {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//H11.m1('a');
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
		float Inverse[][]=new float[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				float e=(float)adj[i][j]/det;
				if((i+j)%2!=0) {
					e=-e;
				}
				Inverse[i][j]=e;
						
				System.out.print(Inverse[i][j]+" ");
			}
			System.out.println();
		}
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
}
