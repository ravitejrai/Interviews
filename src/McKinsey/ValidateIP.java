package McKinsey;

public class ValidateIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IP = "1.2.3.4" ;
		int num = 4 ;
		
		boolean isValid = ValidateIP(IP , num);
		
		if (isValid){
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}

	private static boolean ValidateIP(String iP, int num) {
		// TODO Auto-generated method stub
		String [] values = iP.split("\\.");
		System.out.println(values[0] + values[1] + values[2]  + values[3] );
		if ( values.length != num){
			return false ;
		}
		
		for ( int i = 0 ; i < values.length ; i++){
			
			int ip = Integer.parseInt(values[i]) ;
			if ( ip < 256 && ip > 0){
				return true ;
			}
		}
		
		
		return false;
	}

}
