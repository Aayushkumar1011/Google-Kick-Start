// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb0f5/0000000000ba84ae


import java.util.*;
import java.lang.*;
import java.io.*;

class StudentsMentors {
    public static void main(String[] args) throws java.lang.Exception {
        int test;
        Scanner in = new Scanner(System.in);
        test = in.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = in.nextInt();

            int[] ans = new int[n];
            getMentor(n, arr, ans);

            System.out.print("Case #" + t + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }

    private static void getMentor(int n, int[] arr, int[] ans) {
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = arr[i];
        }
        Arrays.sort(score);
        for (int i = 0; i < n; i++) {
            int ub = upperBound(score, 2 * arr[i]);
            ub--;
            if (arr[i] == score[ub]) {
                ub--;
            }
            if (ub >= 0) {
                ans[i] = score[ub];
            } else {
                ans[i] = -1;
            }
        }
    }

    private static int upperBound(int arr[], int num) {
        int left = -1, right = arr.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= num)
                left = mid;
            else
                right = mid;
        }
        return left + 1;
    }

}
