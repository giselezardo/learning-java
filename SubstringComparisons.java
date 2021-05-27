package com.hackerrank.basic.strings;

import java.util.Scanner;

/*
Write the function getSmallestAndLargest
'smallest' must be the lexicographically smallest substring of length 'k'
'largest' must be the lexicographically largest substring of length 'k'
*/

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        String substring = s.substring(0,k);
        String smallest = substring;
        String largest = substring;

        for (int i=0; i<=s.length()-k; i++){
            substring = s.substring(i, (i+k));
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
