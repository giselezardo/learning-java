package com.hackerrank.basic.introduction;

import java.util.Scanner;

/*
You are given q queries in the form of a, b, and n.
For each query, print the series corresponding to the given a, b, and n values
as a single line of n space-separated integers.
*/

public class Loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int i = 0; i < q; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int s = 0; s <= n - 1; ++s) {
                a += (int)Math.pow(2.0D, (double)s) * b;
                System.out.printf("%s ", a);
            }
        }

        in.close();
    }
}
