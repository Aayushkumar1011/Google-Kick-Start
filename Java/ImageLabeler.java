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
class Main
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

            // System.out.println("Arr: " + Arrays.toString(arr));
            Arrays.sort(arr);
            double res = getMax(arr, n, m);
            System.out.println("Case #" + t + ": " + res);
        }
	}
	
	public static double getMax(int[] arr, int n, int m){
        double res = 0;
        if(m == 1)
            return res = n%2 == 0 ? (arr[n/2-1]+arr[n/2])/2 : arr[n/2];
        for(int i = n-1; i <= n-m+1; i++){
            res += arr[i];
        }
        int remaining = n-m+1;
        if(remaining%2 != 0)
            res += arr[remaining/2];
        else
            res += (arr[remaining/2 - 1] + arr[remaining/2])/2.0;
	    return res;
	}
}
