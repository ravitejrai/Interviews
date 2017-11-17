package McKinsey;

import java.util.HashMap;

public class RemAnagram {
	
	@SuppressWarnings("unchecked")
	
	    public int[] removeCharacter( String[] a , String[] b){
		 int [] res = new int[a.length]; int total =0;
		
		 for ( int i = 0 ; i < a.length ; i++)
		{
			 total =0;//System.out.println(i);
			// System.out.println(a[i]+""+b[i]);
			if(a[i].length()!=b[i].length())
			{
				res[i] = -1;
				continue;
			}
			HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
			HashMap<Character,Integer> hs1 = new HashMap<Character,Integer>();
	
			
		
			/*for ( int j = 0 ; j < a[i].length() ; j++){
				
				hs.put(a[i].charAt(j), hs.getOrDefault(a[i].charAt(j), 0)+1);
				
			}*/
			
			for ( int k = 0 ; k < b[i].length() ; k++)
				hs1.put(b[i].charAt(k), hs1.getOrDefault(b[i].charAt(k), 0)+1);
			
			//System.out.println(hs +""+ hs1);
			for(Character c : a[i].toCharArray())
			{
				if(hs1.containsKey(c) && hs1.get(c)>0)
				{
					hs1.put(c, hs1.get(c)-1);
				}
				else
				{
					total++;
				}
			}
			res[i] = total;
			
		}
			return res;
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a = {"abb","mn","abc"} ;
		String [] b = {"bbc","op","def"} ;
		RemAnagram r = new RemAnagram();
		
		int resu[] = r.removeCharacter(a, b);
		for(int x:resu)
			System.out.println(x);
		 
	}

}
