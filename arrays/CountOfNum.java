package arrays;

public class CountOfNum {
	    public static void main(String[] args) 
	    { 
	        String A[] = { "v","m","v","m","m","c","a" }; 
	  
	        for(int i=0;i<A.length;i++){
	        	int count=0;
	        	for(int j=0;j<A.length;j++) {
	        		if(A[i]==A[j]) {
	        			count++;
	        		}
	        	}
	        	int dup=0;
	        	for(int k=0;k<i;k++) {
	        		if(A[i]==A[k]) {
	        			dup++;
	        		}
	        	}
	        	if(dup==0) {
	        		System.out.println(A[i]+"-->"+count);
	        	}
	        }
	        /*int max = Integer.MIN_VALUE; 
	        for (int i = 0; i < A.length; i++) { 
	            if (A[i] > max) 
	                max = A[i]; 
	        } 
	        for(int i=0;i<A.length;i++) {
	        	System.out.print(A[i]+" ");
	        }
	        int B[] = new int[max + 1]; 
	        System.out.println(B.length);
	        for(int i=0;i<A.length;i++) {
	        	System.out.print(B[A[i]]+" ");
	        }
	        System.out.println();
	        for (int i = 0; i < A.length; i++) { 
	            // increment in array B for every integer 
	            // in A. 
	        	
	            B[A[i]]++;
	            System.out.print(B[A[i]]+" ");
	        } 
	        System.out.println();
	        for (int i = 0; i <= max; i++) { 
	            // output only if element is more than 
	            // 1 time in array A. 
	            if (B[i] >= 1) 
	                System.out.println(i + "-" + B[i]); 
	        } */
	    } 
	}

