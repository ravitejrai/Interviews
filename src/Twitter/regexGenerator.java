package Twitter;

import java.util.regex.*;

class Main
{
  public static void main(String[] args)
  {
    String txt="10.10.10.10 - - [27/Sep/2016:05:22:00 +0000] \"GET /1.1/friendships/list.json?user_id=123 HTTP/1.1\" 500 563 19 \"Twitter-iPhone/6.63 iOS/10.0.2 (Apple;iPhone7,2;;;;;1)\" 177.177.177.177";

    String re1="(10\\.10\\.10\\.10 - - \\[27\\/Sep\\/2016:05:22:00 \\+0000\\] \"GET \\/1\\.1\\/friendships\\/list\\.json\\?user_id=123 HTTP\\/1\\.1\" 500 563 19 \"Twitter-iPhone\\/6\\.63 iOS\\/10\\.0\\.2 \\(Apple;iPhone7)";	// Command Seperated Values 1
    String re2="(,)";	// Any Single Character 1
    String re3="(2)";	// Integer Number 1
    String re4="(;)";	// Any Single Character 2
    String re5="(;)";	// Any Single Character 3
    String re6="(;)";	// Any Single Character 4
    String re7="(;)";	// Any Single Character 5
    String re8="(;)";	// Any Single Character 6
    String re9="(1)";	// Integer Number 2
    String re10="(\\))";	// Any Single Character 7
    String re11="(\")";	// Any Single Character 8
    String re12="( )";	// White Space 1
    String re13="(177\\.177\\.177\\.177)";	// IPv4 IP Address 1

    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7+re8+re9+re10+re11+re12+re13,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.find())
    {
        String csv1=m.group(1);
        String c1=m.group(2);
        String int1=m.group(3);
        String c2=m.group(4);
        String c3=m.group(5);
        String c4=m.group(6);
        String c5=m.group(7);
        String c6=m.group(8);
        String int2=m.group(9);
        String c7=m.group(10);
        String c8=m.group(11);
        String ws1=m.group(12);
        String ipaddress1=m.group(13);
        System.out.print("("+csv1.toString()+")"+"("+c1.toString()+")"+"("+int1.toString()+")"+"("+c2.toString()+")"+"("+c3.toString()+")"+"("+c4.toString()+")"+"("+c5.toString()+")"+"("+c6.toString()+")"+"("+int2.toString()+")"+"("+c7.toString()+")"+"("+c8.toString()+")"+"("+ws1.toString()+")"+"("+ipaddress1.toString()+")"+"\n");
    }
  }
}
