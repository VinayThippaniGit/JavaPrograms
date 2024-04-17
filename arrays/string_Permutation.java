package arrays;

public class string_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="250";
		//String s=Integer.toString(a);
		char ar[]=a.toCharArray();
		/*for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}*/
		permutation(ar,0);
	}
	public static void permutation(char ar[],int fi) {
		if(fi==ar.length-1) {
			
			System.out.println(ar);
			return;
		}
		for(int i=fi;i<ar.length;i++) {
			swap(ar,i,fi);
			permutation(ar,fi+1);
			swap(ar,i,fi);
		}
	}
	public static void swap(char ar[],int i,int fi) {
		char temp=ar[i];
		ar[i]=ar[fi];
		ar[fi]=temp;
	}
}

