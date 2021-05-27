package com.hackerrank.basic.introduction;

import java.util.Scanner;

/*
Given an integer,N, print its first 10 multiples.
Each multiple Nxi (where 1 <= i <=10) should be printed on a new line in the form: N x i = result.
Constraints: 2 <= N <= 20
*/

public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N<2 || N>20){
            System.out.println("Invalid Number - it should be between 2 and 20");
        } else getMultiples(N);

    }

    private static void getMultiples(int N) {

        for (int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
