package McKinsey;

import java.math.BigInteger;

public class SubArray {
	
	static void findsubarray(int [] arr){
		int n = arr.length ;
		//System.out.println(n);
		 for (int i = 0; i < (1<<n); i++)
	        {
	            // Print current subset
	            for (int j = 0; j < n; j++)
	            	for (int k=i; k<=j; k++)
	     
	                    System.out.print(arr[k]+"");
	            	
	            }
	            System.out.println();
	        }
		 	
	
	 static void printSubsequences(int [] arr ,int n)
	    {
	        /* Number of subsequences is (2**n -1)*/
	        int opsize = (int)Math.pow(2, n);
	      
	        /* Run from counter 000..1 to 111..1*/
	        for (int counter = 1; counter < opsize; counter++)
	        {
	            for (int j = 0; j < n; j++)
	            {
	                /* Check if jth bit in the counter is set
	                    If set then print jth element from arr[] */
	       
	                if (BigInteger.valueOf(counter).testBit(j))
	                    System.out.print(arr[j]+" ");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4} ;
		int k = 3 ;
		printSubsequences(arr,k);
		//findsubarray(arr);
	}

}
