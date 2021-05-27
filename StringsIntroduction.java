package com.hackerrank.basic.strings;

import java.util.Locale;
import java.util.Scanner;

/*
Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/

public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int sum = A.length() + B.length();
        System.out.println(sum);

        int comp = A.compareTo(B);
        if (comp > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
