/**
https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caea6/0000000000b76fae

Input
The first line of the input gives the number of test cases, T. T test cases follow.
The first line of each test case contains an integer N, which denotes the number of elements in the first array.
The second line of each test case contains N integers A1,A2,…,AN. Ai denotes the points gained for answering the i-th question of Audio Validation Task.
The third line of each test case contains an integer M, which denotes the number of elements in the second array.
The fourth line of each test case contains M integers B1,B2,…,BM. Bi denotes the points gained for answering the i-th question of Image Labeler Task.
The fifth line of each test case contains an integer K, which denotes the number of elements to be selected in total, from both arrays, using the process described above.

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
            int[] arr1 = new int[n];
            for(int i = 0; i < n; i++){
                int ele = sc.nextInt();
                arr1[i] = ele;
            }

            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for(int i = 0; i < m; i++){
                int ele = sc.nextInt();
                arr2[i] = ele;
            }
            int k = sc.nextInt();
            int[][] dp = new int[n+m+1][k+1];
            for(int i = 0; i <= n+m; i++){
                dp[i][0] = 0;
            }
            for(int j = 0; j <= k; j++){
                dp[0][j] = 0;
            }


            System.out.println("Case #" + ": " + t + "- A: " + Arrays.toString(arr1));
            System.out.println("Case #" + ": " + t + "- B: " + Arrays.toString(arr2));
            // int res = getMax(arr1, arr2, n, m, k, dp);
            // System.out.println("Case #" + t + ": " + res);
        }
        
        // System.out.println("Arr: " + Arrays.toString(arr));
	}
	
	public static int getMax(int[] arr1, int arr2, int n, int m, int k, int[][] dp){
        int res = 0;
        // 
        int i = 1, ii = 1;
        while(i < n && )
                for(int j = 1; j <= k; j++){
                    if(arr1[i] >= arr2[ii]){

                    }
                }
            }
        }
	    return res;
	}
}
