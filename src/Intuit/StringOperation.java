package Intuit;

public class StringOperation {
	
	static void calculation (String expression){
		String[] result=new String[expression.length()];
		result = expression.split("(?<=[-+*/])|(?=[-+*/])");
		int total = Integer.parseInt(result[0]);
		
		for ( int i = 0 ; i < result.length ; i++){	
			if (result[i].equals("+"))
			total = total + Integer.parseInt(result[i+1])  ; 
			if (result[i].equals("-"))
			total = total - Integer.parseInt(result[i+1])  ; 
		}
		System.out.println(total);
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String expression = "9+6-12+12" ;
			calculation(expression);
	}

}
