// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb0f5/0000000000ba82c5

import java.util.*;
import java.lang.*;
import java.io.*;

class MatchingPalindrome {
    public static void main(String[] args) throws java.lang.Exception {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int test = 1; test <= t; test++) {
            int n = in.nextInt();
            String str = in.next();
            String res = getPalindrome(str);
            System.out.println("Case #" + test + ": " + res);
        }
    }

    private static String getPalindrome(String str) {
        int n = str.length();
        int[] dp = new int[n];
        int i = 1, j = 0;
        while (i < n) {
            if (str.charAt(i) == str.charAt(j)) {
                dp[i] = j + 1;
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = dp[j - 1];
                } else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
        String ans;
        if (dp[n - 1] >= 0 && n % (n - dp[n - 1]) == 0) {
            ans = str.substring(0, n - dp[n - 1]);
        } else {
            ans = str;
        }
        return ans;
    }
}
