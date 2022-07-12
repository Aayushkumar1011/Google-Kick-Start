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

class MaximumGain {

  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();

    for (int t = 1; t <= test; t++) {
      // Read an int value
      int n = sc.nextInt();
      int[] arr1 = new int[n];
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();;
      }

      int m = sc.nextInt();
      int[] arr2 = new int[m];
      for (int i = 0; i < m; i++) {
        arr2[i] = sc.nextInt();;
      }
      int k = sc.nextInt();
      int res = getMax(arr1, arr2, 0, n, 0, m, k);
      System.out.println("Case #" + t + ": " + res);
    }
  }

  public static int getMax(int[] arr1, int[] arr2, int s1, int n, int s2, int m, int k) {
    if (k <= 0)
      return 0;
    if (s1 > n - 1 && s2 > m - 1)
      return 0;
    int ans1 = 0;
    int ans2 = 0;
    if (s1 < n) {
      ans1 = Math.max(arr1[s1] + getMax(arr1, arr2, s1 + 1, n, s2, m, k - 1),
        arr1[n - 1] + getMax(arr1, arr2, s1, n - 1, s2, m, k - 1));
    }

    if (s2 < m) {
      ans2 = Math.max(arr2[s2] + getMax(arr1, arr2, s1, n, s2 + 1, m, k - 1),
        arr2[m - 1] + getMax(arr1, arr2, s1, n, s2, m - 1, k - 1));
    }
    return Math.max(ans1, ans2);
  }
}
