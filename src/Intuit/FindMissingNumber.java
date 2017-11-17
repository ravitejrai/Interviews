package Intuit;

public class FindMissingNumber {
	
	static int missingNumber(int [] arr){
		int n = arr[arr.length -1] ;
		int total = 0 ;
		int sum = 0;
		total = n*(n+1)/2 ;
		System.out.println(total);
		for ( int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i] ;
		}
		System.out.println(sum);
		return total-sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,5,6,7} ;
		int diff = missingNumber(arr);
		System.out.println(diff);
	}

}
