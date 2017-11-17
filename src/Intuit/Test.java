package Intuit;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	static HashMap<Character,ArrayList<Character>> map = new  HashMap<Character,ArrayList<Character>>();
	static ArrayList<Character> list = new ArrayList<Character>();

	static void canonical(String [] arr1 , String [] arr2){
		for ( int i = 0 ; i < arr1.length ; i++){
			map.put(arr1[i].charAt(0),new ArrayList<Character>());
		}
		System.out.println(map);
		
		for ( int j = 0 ; j < arr2.length ; j++){
			char k = arr2[j].charAt(0);
			char v = arr2[j].charAt(2);
			if ( map.containsKey(k)){
				map.get(k).add(v);
			}
			if ( map.containsKey(v)){
				map.get(v).add(k);
			}
		}
		System.out.println(map);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] arr1 = { "1,ad,de" , "2,de,rt" , "3,er,fr" , "4,df,gf"};
			String [] arr2 = { "1,2" , "1,3", "2,3" , "4,1"};
			canonical(arr1,arr2);
			
	}

}
