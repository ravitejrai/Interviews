package McKinsey;

import java.util.HashSet;

public class FIleParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums = {1,1,2} ;
			int j = 0 ;
			int i = 0 ;
			for ( j = 0 ; j < nums.length -1;){		
			if (nums[i]== nums[j]){
				j++ ;
			}
			else{
				nums[i+1] = nums[j] ;
				i++ ;
			}
			}
			System.out.println(i+1);
	}
}
