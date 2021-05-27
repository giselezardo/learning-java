package com.hackerrank.basic.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Use the NumberFormat class' getCurrencyInstance method to convert
 into the US, Indian, Chinese,and French currency formats
*/

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale locIndia = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(locIndia);

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
