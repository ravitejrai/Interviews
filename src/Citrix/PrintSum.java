package Citrix;

public class PrintSum {
	
	private static final int MAX = 1000000 ;
	
	static void printpairs( int [] arr , int sum){
		
		boolean [] binmap = new boolean[MAX];
		
		for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5} ;
		int sum = 5 ;
		printpairs( a , sum) ;
	}

}
