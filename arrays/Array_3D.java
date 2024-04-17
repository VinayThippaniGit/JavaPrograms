package arrays;

public class Array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a=new int[1][2][3];
		a[0][0][0]=1;
		a[0][0][1]=2;
		a[0][0][2]=3;
		
		a[0][1][0]=6;
		a[0][1][1]=7;
		a[0][1][2]=8;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(j+" --- ");
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
