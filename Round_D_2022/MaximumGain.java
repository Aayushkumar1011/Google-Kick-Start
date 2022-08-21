// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caea6/0000000000b76fae

import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumGain {
    public static int ans = 0;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                arr1[i] = ele;
            }

            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                int ele = sc.nextInt();
                arr2[i] = ele;
            }
            int k = sc.nextInt();
            int[][] dp = new int[n + m + 1][k + 1];
            for (int i = 0; i <= n + m; i++) {
                dp[i][0] = 0;
            }
            for (int j = 0; j <= k; j++) {
                dp[0][j] = 0;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int res = getMax(arr1, arr2, n, m, k, dp);
            System.out.println("Case #" + t + ": " + res);
        }
    }

    public static int getMax(int[] arr1, int[] arr2, int n, int m, int k, int[][] dp) {
        if (n < 0 && m < 0)
            return 0;
        if (k <= 0)
            return 0;
        if (n < 0 && m >= 0)
            Math.max(ans,
                    ans + arr2[m - 1] + getMax(arr1, arr2, n, m - 1, k - 1, dp));
        if (m < 0 && n >= 0)
            return Math.max(ans,
                    ans + arr1[n - 1] + getMax(arr1, arr2, n - 1, m, k - 1, dp));

        if (arr1[n - 1] > arr2[m - 1])
            return Math.max(ans,
                    ans + arr1[n - 1] + getMax(arr1, arr2, n - 1, m, k - 1, dp));
        else
            return Math.max(ans,
                    ans + arr2[m - 1] + getMax(arr1, arr2, n, m - 1, k - 1, dp));
    }
}
