package com.hackerrank.basic.introduction;

import java.util.Scanner;

//Given an input integer, you must determine which primitive data types are capable of properly storing that input

public class DataTypes {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; ++i) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128L && x <= 127L) {
                    System.out.println("* byte");
                }

                if ((double)x >= -Math.pow(2.0D, 15.0D) && (double)x <= Math.pow(2.0D, 15.0D) - 1.0D) {
                    System.out.println("* short");
                }

                if ((double)x >= -Math.pow(2.0D, 31.0D) && (double)x <= Math.pow(2.0D, 31.0D) - 1.0D) {
                    System.out.println("* int");
                }

                if ((double)x >= -Math.pow(2.0D, 63.0D) && (double)x <= Math.pow(2.0D, 63.0D) - 1.0D) {
                    System.out.println("* long");
                }
            } catch (Exception var6) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

    }
}
