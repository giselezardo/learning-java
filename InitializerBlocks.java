package com.hackerrank.basic.introduction;

import java.util.Scanner;

/*
Should output the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.
If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes
*/

public class InitializerBlocks {
    static Scanner scan;
    static int H;
    static int B;
    static boolean flag;

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

    static {
        scan = new Scanner(System.in);
        H = scan.nextInt();
        B = scan.nextInt();
        flag = true;
        if (H <= 0 || B <= 0) {
            flag = false;
            throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
