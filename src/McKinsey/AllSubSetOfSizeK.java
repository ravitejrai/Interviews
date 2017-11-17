package McKinsey;

import java.util.ArrayList;
import java.util.List;

import java.util.*;
public class AllSubSetOfSizeK {
	
    public static ArrayList<ArrayList<Integer>> choose(int [] a, int k) {
        ArrayList<ArrayList<Integer>> allPermutations = new ArrayList<ArrayList<Integer>>();
        enumerate(a, a.length, k, allPermutations);
        for(ArrayList<Integer> x: allPermutations)
        {
        	 System.out.println(findMinDiff(x));
        }
      
        System.out.println(allPermutations.size());
        return allPermutations;
    }
    
    static int findMinDiff(ArrayList<Integer>arr)
    {
    	ArrayList<Integer> test = new ArrayList<Integer>() ;
    	int n = arr.size() ;
        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;
    
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((arr.get(i) - arr.get(j)) )< diff)
                    diff = Math.abs((arr.get(i) - arr.get(j)));
        					test.add(diff);
        return diff;
    }

    private static void enumerate(int [] a, int n, int k, ArrayList<ArrayList<Integer>> allPermutations) {
        if (k == 0) {
            ArrayList<Integer> singlePermutation = new ArrayList<Integer>();
            for (int i = n; i < a.length; i++){
                singlePermutation.add(a[i]);
            }
            allPermutations.add(singlePermutation);
            return;
        }

      for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            enumerate(a, n-1, k-1, allPermutations);
            swap(a, i, n-1);
        }
    }  
    
    public static void swap(int[] a, int i, int j) {
        Integer temp = a[i];
        a[i] = a[j] ;
        a[j] = temp ;
    }

    public static void main(String[] args) {
        int a [] = {2,4,10,7};
        int k =3;
        System.out.println(choose(a, k));
    }
}