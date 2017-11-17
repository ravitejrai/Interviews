package McKinsey;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.google.common.net.InetAddresses;

public class IPCheck{

	 public static void main(String[] args) {
	      
	        
	       /* String ipv4 = "^([0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$";
	        String ipv6 = "^([0-9a-fA-F]{1,4})(:([0-9a-fA-F]{1,4})){7}$";*/
	  
	        
	        try{
	            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	            String s = sc.readLine();
	            int n = Integer.parseInt(s);
	            Pattern ipv4 = Pattern.compile("^([1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[01]?[1-9][0-9]|[001]?[1][0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$");
	            Pattern ipv6 = Pattern.compile("^([0-9a-fA-F]{1,4})(:([0-9a-fA-F]{1,4})){7}$");
	            Matcher m1,m2;
	            for(int i=0;i<n;i++){
	                    s=sc.readLine();
	                    m1=ipv4.matcher(s);
	                    m2=ipv6.matcher(s);
	                    if (m1.matches())
	                        System.out.println("IPv4");
	                    else if(m2.matches())
	                        System.out.println("IPv6");
	                    else System.out.println("Neither");
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	 }
}
