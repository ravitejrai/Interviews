package Citrix;

/*I had faced this problem in a coding test and could not find an efficient approach.

Given a Matrix A, The rules for movement are as follows :

   Can only move Right or Down from any element
   Can only move within the same row or column of element we start from initially.
   You can only visit or cross an element if its value is lesser than the value of element you start from.

Find total number of elements one can visit, If one starts from an element A(i,j) where i-> row and
j-> column.

Note : You have to print this output for each matrix element.

Input Matrix :
1 2 3
2 3 1
3 1 2

Output:
1 1 3
1 3 1
3 1 1

Explain : from 1 (i=0,j=0) row wise We can not traverse further so visit-able nodes = 1
Also, column wise it is same. So for (i=0,j=0) max total nodes is 1.*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxVisitableNodes {

	/* package whatever; // don't place package name! */
	/* Name of the class has to be "Main" only if the class is public. */

		public static void main (String[] args) throws java.lang.Exception
		{
			int[][] array = {{0, 1, 0, 0},
							 {1, 0, 0, 0},
							 {0, 0, 0, 1}};
			
			
			Stack<Integer> stack = new Stack<Integer>(); // stores the index only
			int[][] output = new int[array.length][array[0].length];
			for (int i = array.length-1; i >= 0; i--) // direction not important
			{
				stack.clear();
				for (int j = array[0].length-1; j >= 0; j--)
				{
					while (!stack.empty() && array[i][stack.peek()] < array[i][j])
						stack.pop();
					int offset;
					if (stack.empty())
						offset = array[0].length;
					else
						offset = stack.peek();
					output[i][j] = offset - j - 1;
					stack.push(j);
				}
			}
			
			for (int i = array[0].length-1; i >= 0; i--) // direction not important
			{
				stack.clear();
				for (int j = array.length-1; j >= 0; j--)
				{
					while (!stack.empty() && array[stack.peek()][i] < array[j][i])
						stack.pop();
					int offset;
					if (stack.empty())
						offset = array.length;
					else
						offset = stack.peek();
					output[j][i] += offset - j - 1;
					stack.push(j);
				}
			}

			for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				output[i][j] += 1;

			for (int[] a: output)
				System.out.println(Arrays.toString(a));
		}
	}

