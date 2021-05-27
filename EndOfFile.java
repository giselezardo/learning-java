package com.hackerrank.basic.introduction;

import java.util.Scanner;

//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content

    public class EndOfFile {
        public static void main(String[] args) {
            System.out.println("Digite: ");
            Scanner scan = new Scanner(System.in);
            int i = 0;

            while(scan.hasNext()) {
                ++i;
                System.out.println(i + " " + scan.nextLine());
            }

        }
}
