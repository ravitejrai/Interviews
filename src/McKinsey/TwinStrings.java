package McKinsey;

import java.util.HashMap;

public class TwinStrings {

	
	static String[] CheckTwin(String []one , String []two){
		
		String [] returnString = new String[one.length] ;
		
		for ( int i = 0 ; i < one.length ; i++){
			
			if(one[i].length()!=two[i].length())
			{
				returnString[i] ="No";
				continue;
			}
			HashMap <Character,Integer>  odd = new HashMap <Character,Integer>() ;
			HashMap <Character,Integer>  even = new HashMap <Character,Integer>() ;
			
			String x = one[i];
			char[] xarr = x.toCharArray();
			for(int k=0;k<xarr.length;k++ )
			{
				if(k%2==0)
					even.put(x.charAt(k), even.getOrDefault(x.charAt(k), 0)+1);
				else
					odd.put(x.charAt(k), odd.getOrDefault(x.charAt(k), 0)+1);
			}
			String y = two[i];
			char[] yarr = y.toCharArray();
			int j=0;
			for(j=0;j<yarr.length;j++)
			{
				if(j%2==0)
				{
					if(even.containsKey(yarr[j]) && even.get(yarr[j]) >0)
						even.put(yarr[j], even.get(yarr[j])-1);
					else
					{
						returnString[i] = "No";
						break;
					}
				}
				
				else
				{
					if(odd.containsKey(yarr[j]) && odd.get(yarr[j]) >0)
						odd.put(yarr[j], odd.get(yarr[j])-1);
						else
						{
							returnString[i] = "No";
							break;
						}
					}
			}
			
			if(j==yarr.length)
				returnString[i] = "Yes";
		}
		return returnString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] one = {"ADDD","DEFGBC","ABCD"} ;
			String [] two = {"AADD","DGFE","CBAD"} ;
			String result[] = CheckTwin(one, two) ;
			for (String x:result)
				System.out.println(x);
	}

}
