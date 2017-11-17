package Intuit ;

import java.io.*;
import java.util.*;

/*
Write a function that takes two user’s browsing histories as input and 
returns the longest contiguous sequence of URLs that appears in both.
Sample output:
(user0, user2):
   /four.html
   /six.html
   /seven.html
(user1, user2):
   /two.html
   /three.html
   /four.html
   /six.html
(user0, user3):
   None
(user1, user3):
   /three.html
 */

class Snippet {
  
  
  static List<String> user0 = Arrays.asList(
      "/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html" );
  static List<String> user1 = Arrays.asList(
      "/one.html", "/two.html", "/three.html", "/four.html", "/six.html");
  static List<String> user2 = Arrays.asList(
      "/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html");
  static List<String> user3 = Arrays.asList("/three.html", "/eight.html");

  // Your function here

  
  public static List<String> compare(List<String> userA, List<String> userB){
    
    List<String> L = new ArrayList<String>();
    List<List<String>> res = new ArrayList<List<String>>();
    LinkedHashMap<String,Integer> user1 = new   LinkedHashMap<String,Integer>();
    LinkedHashMap<String,Integer> user2 = new   LinkedHashMap<String,Integer>();
      
      int count = 0;
      int max_count = 0;
      int i=0;
      for(String s :userA)
      {
    	  user1.put(s,i);
    	  i++;
      }
      
      int j=0;
      for(String s :userB)
      {
    	  user2.put(s,j);
    	  j++;
      }
      System.out.println(user1);
      System.out.println(user2);
      int index =-1;
      for(String u1:userA)
      {
    	  if(user2.containsKey(u1))
    	  {
    		  if(L.size()==0){
    			  L.add(u1);
    			  index = user2.get(u1);
    			  count = count+1;
    		  }
    		  else if (user2.get(u1) == index +1)
    		  {
	    		  index = index +1;
	    		  count = count +1;
	    		  L.add(u1);	  
    		  }
    		  
    		  else if(count>max_count)
     		 {
    			 res.clear();
    			 res.add(new ArrayList<String>(L));
     			 L.clear();
     			 L.add(u1);  
     			 max_count = count;
     			 count = 1;
     			 index = user2.get(u1);	
     		 }  
    	  }  	
      }
      
    if (res.isEmpty())
    	return L ;
    else
    return L.size() > res.get(0).size() ? L : res.get(0); 
  
  }
  
  
  
  
  public static void main(String[] args) {
    
    
   List<String> user0 = Arrays.asList(
		   "/one.html","/three.html", "/four.html","/six.html");
   List<String> user1 = Arrays.asList(
		   "/nine.html", "/two.html", "/three.html", "/four.html", "/six.html" , "/seven.html", "/two.html", "/three.html", "/four.html");
    
  List<String> result = compare(user0, user1); 
    System.out.println(result);

  }
}