// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb0f5/0000000000ba856a

import java.util.*;
import java.lang.*;
import java.io.*;

class ColoringGame {
    public static void main(String[] args) throws java.lang.Exception {
        int test;
        Scanner in = new Scanner(System.in);
        test = in.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = in.nextInt();
            int res = getMaxScore(n);
            System.out.println("Case #" + t + ": " + res);
        }
    }

    private static int getMaxScore(int n) {
        return (n + 4) / 5;
    }
}
