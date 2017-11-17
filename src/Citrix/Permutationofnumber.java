package Citrix;

import java.util.Scanner;

public class Permutationofnumber {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3} ;
		int num ;
		List<List<Integer>> x = permute(a);
		for (int i = 0 ; i <= x.size() -1 ; i++ ){
			List<Integer> t = x.get(i) ;	
			System.out.println(t);
			for (int j = 0 ; j < 1 ; j++ ){
				num = t.get(0) * 100 + t.get(1) * 10 + t.get(2) ;
				System.out.println(num);
				if (num % 8 == 0){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
					
			}
			
		}
			
	}
	
	public static List<List<Integer>> permute(int[] num) {
		List<List<Integer>> result = new ArrayList<>();

		//start from an empty list
		result.add(new ArrayList<>());

		for (int i = 0; i < num.length; i++) {
			//list of list in current iteration of the array num
			List<List<Integer>> current = new ArrayList<>();

			for (List<Integer> l : result) {
				// # of locations to insert is largest index + 1
				for (int j = 0; j < l.size()+1; j++) {
					// + add num[i] to different locations
					l.add(j, num[i]);

					List<Integer> temp = new ArrayList<>(l);
					current.add(temp);

					l.remove(j);
				}

			}

			result = new ArrayList<>(current);
		}

		return result;
	}*/
	
    static String calc(int n){
        boolean isDiv=false;
        if(n<10){
            if(n==0||n==8) return "Yes";
            else return "No";
        }
        if(n<100){
            if(n%8==0) return "Yes";
            else if(Integer.reverse(n)%8==0) return "Yes";
            else return "No";
        }
        int countdigit=Integer.toString(n).length();
        int[] ia=new int[countdigit];
        int i=0;
        while (n>0){
            int digit=n%10;
            ia[i]=digit;
            n=n/10;
            i++;
        }

        int a,b,c;
        for (int j = 0; j < countdigit; j++) {
            a=ia[j];
            for (int k = 0; k < countdigit; k++) {
                if(j==k) continue;
                b=ia[k];
                for (int m = 0; m < countdigit; m++) {
                    if(m==k || m==j) continue;
                    c=ia[m];
                    if(c%2!=0) continue;
                    int num=a*100+b*10+c;
                    if(num%8==0) {
                        return "Yes";
                    }
                }
            }
        }
        return isDiv?"Yes":"No";
    }


	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(calc(ab.nextInt()));
	}
	 }
	
}
