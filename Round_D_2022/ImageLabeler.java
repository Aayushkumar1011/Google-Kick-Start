// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caea6/0000000000b76e11

import java.util.*;
import java.lang.*;
import java.io.*;

class ImageLabeler {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int ind = 0; ind < n; ind++) {
                int ele = sc.nextInt();
                arr[ind] = ele;
            }
            Arrays.sort(arr);
            double res = getMax(arr, n, m);
            System.out.println("Case #" + t + ": " + res);
        }
    }

    public static double getMax(int[] arr, int n, int m) {
        double res = 0;
        if (m == 1)
            return res = n % 2 == 0 ? (arr[n / 2 - 1] + arr[n / 2]) / 2.0 : arr[n / 2] / 1.0;
        for (int i = n - 1; i >= n - m + 1; i--) {
            res += arr[i];
        }
        int remaining = n - m + 1;
        if (remaining % 2 != 0)
            res += arr[remaining / 2] / 1.0;
        else
            res += (arr[remaining / 2 - 1] + arr[remaining / 2]) / 2.0;
        return res;
    }
}
