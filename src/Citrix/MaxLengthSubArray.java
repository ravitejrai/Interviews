package Citrix;

class MaxLengthSubArray{
	
	public static int findMaxLength(int k, int arr[], int arrLength){
		int[][] subArraySums = new int[arrLength][arrLength];//store sums from index [i][j] in here
		int maxLength = 0;

		for(int i = 0; i < arrLength; i++){

			for(int j = i; j < arrLength; j++){
				if(i == j){
					subArraySums[i][j] = arr[i];
				}else{
					subArraySums[i][j] = subArraySums[i][j-1] + arr[j];//do not compute sums already computed dp approach
				}

				//because initially maxLength was set to 0
				if(subArraySums[i][j] <= k && maxLength <= j - i){
					maxLength = j - i + 1;
				}
			}
		}
/*//Uncomment to see the sums per each subarray
			for(int i = 0; i < arrLength; i++){
				for(int j = 0; j < arrLength; j++){
				System.out.print("["+ i + "]"+ "[" + j +"] "+subArraySums[i][j] +" ");
			}
			System.out.println("\n");
		}*/
		

		return maxLength;
	}

	public static void main(String args[]){
		int [] arr = new int[] {1,1,1,1,3,7};
		int k = 7;
		int arrLength = 6;
		System.out.println("longest subarray has length: " + findMaxLength(k, arr, arrLength));
	}
};