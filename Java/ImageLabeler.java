/**
https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caea6/0000000000b76e11
Input
The first line of the input gives the number of test cases, T. T test cases follow.
The first line of each test case contains two integers N and M: the number of regions, and the number of categories respectively.
The next line contains N integers A1,A2,…,AN.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ImageLabeler
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++)
        {
            // Read an int value
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int ind = 0; ind < n; ind++){
                int ele = sc.nextInt();
                arr[ind] = ele;
            }
            
            
            double[][] dp = new double[n+1][m+1];
            for(int i = 0; i <= n; i++){
                dp[i][0] = 0;
            }
            for(int j = 0; j <= m; j++){
                dp[0][j] = 0;
            }


            System.out.println("Arr: " + Arrays.toString(arr));
            double res = getMax(arr, n, m, dp);
            System.out.println("Case #" + t + ": " + res);
        }
        
        // System.out.println("Arr: " + Arrays.toString(arr));
	}
	
	public static double getMax(int[] wt, int n, int w, double[][] dp){
        double res = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= w; j++){
                dp[i][j] = (wt[i - 1] + dp[i-1][j-1])/2.0;
                res = Math.max(res, dp[i][j]);
            }
        }
	    return res;
	}
}
