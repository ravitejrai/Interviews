package Citrix;

import java.util.HashSet;
import java.util.Stack;


public class findMinLengthString {
	
public static int removeSub(String target, HashSet <String> set) {
	 if (target.length() == 0) {
		 return 0 ;
	 }
	 
	 Stack<Character> stack = new Stack<Character>();
	 char [] chs = target.toCharArray() ;
	 
	 for (int i = 0 ; i < chs.length ; ++i) {
	   if (stack.isEmpty()) {			   
		   stack.push(chs[i]);
		   continue;
	   }
	   
	   StringBuilder sub = new StringBuilder ();
	   sub.append(stack.peek()) ;
	   sub.append(chs[i]) ;
	   if (set.contains(sub.toString())) {			   
		   stack.pop() ;			   
	   } else {
		   stack.push(chs[i]) ;
	   }
	   
	   sub.setLength(0) ;
	 }
	 		
	 return stack.size() ;
}

public static String removeSubstring(String s, String[] a){
StringBuffer buffer = new StringBuffer(s);
for(int i=0; i<a.length; i++){
while(s.contains(a[i])){
int offset = s.indexOf(a[i]);
buffer.delete(offset, offset+a[i].length());
i = 0 ;
s=buffer.toString();
}
}
int x = buffer.length();
System.out.println("The Size is :" + x);
return buffer.toString();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = "dabababa";
		@SuppressWarnings("unused")
		String target1 = "aaabbb";
		String[] a = {"ab","cd"} ;
		String[] a1 = {"ab"} ;

        HashSet<String> patterns = new HashSet<String>();
        patterns.add("ab");
        patterns.add("da");
        //System.out.println((removeSub(target, patterns)));
        System.out.println("The new value is :" + removeSubstring(target,a1));

	}

}
