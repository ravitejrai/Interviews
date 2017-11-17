package Intuit;

public class SubStringPalindrome {
	
/*	static void GenerateSubString(String str){
		int n = str.length() ;
		
		for ( int i = 0 ; i < n ; i ++){
			for ( int j = i+1 ; j < n ; j++){
				System.out.println(str.substring(i, j));
			}
		}
	}*/
	
	static boolean CheckPlaindrome(String str){
		
		for ( int i = 1; i<str.length() ; i++){
			if ( i < str.length()-2 && str.charAt(i) == str.charAt(i+1) && str.charAt(i-1) == str.charAt(i+1))
				return true ;
		if (str.charAt(i-1)==str.charAt(i+1))
			return true ;
		}
		return false ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "abcd" ;
			//GenerateSubString(str);
			CheckPlaindrome(str);
	}

}
