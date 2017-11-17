package McKinsey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListOfPrime {
	
	static int checkprime(int n){
		boolean [] isPrime = new boolean[n];
		int count = 0 ;
		for ( int i = 2 ; i < n ; i++){
			if (isPrime[i] == false)
				count++ ;
			for ( int j = 2 ; i* j < n ; j++){
				isPrime[i*j] = true ;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 100 ;
			//int p = 0;
			System.out.println(checkprime(n));
			/*ArrayList al = new ArrayList() ;
			ArrayList al1 = new ArrayList() ;
			for(int i=2;i<n;i++)
			{
			p=0;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			p=1;
			}
			if(p==0){
			System.out.print(i + " ");
			al.add(i) ;
			}
			}
			System.out.println();
			System.out.println(al);
			for ( int i = 0 ; i < 5 ; i ++){
				Collections.shuffle(al);
				al1.add(al.get(i));
			}
			System.out.println(al1);*/
			
}
}
