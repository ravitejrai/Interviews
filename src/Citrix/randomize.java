package Citrix;

import java.util.Arrays;
import java.util.Random;

/*1) Write a program to play all the songs in the music  player randomly such that no song should repeat until all the songs are played once. 
The complexity should be O(n). Use suitable data structure. 
(Assumptions: Songs can be represented with numbers and deletion of song is a rare case)*/

public class randomize {
	
	static void randomize(int [] arr , int n) { 
		Random r = new Random();
		
		for ( int i = n-1 ; i > 0 ; i--){
			int j = r.nextInt(i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8} ;
		int n = arr.length;
        randomize (arr, n);
	}

}
