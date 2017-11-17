package Citrix;

import java.util.Arrays;
import java.util.Scanner;

public class Shape {

	public static void main (String[] args) {
		 Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t!=0)
	    {
	        int n=scan.nextInt();
	        char a[][]=new char[n][n+1];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n+1;j++)
	            a[i][j]=' ';
	        }
	        int start=0;
	        int end=n;
	        for(int i=0;i<n;i++)
	        {
	            if(start<end)
	            {
	                a[i][start]=a[i][end]='*';
	                start++;
	                end--;
	            }else
	              a[i][start]='*';
	        }
	        
	         for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n+1;j++)
	              System.out.print(a[i][j]);
	        }
	        System.out.println();
		t--;
		}
	}
}
