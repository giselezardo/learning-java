package com.hackerrank.basic.strings;

//Given a string A, print Yes if it is a palindrome, print No otherwise.

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int equal = 0;
        for(int i=0; i<A.length()/2; i++)
            if (A.charAt(i) == A.charAt(A.length()-i-1)) {
                equal++;
            }

        if (equal == A.length()/2){
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
