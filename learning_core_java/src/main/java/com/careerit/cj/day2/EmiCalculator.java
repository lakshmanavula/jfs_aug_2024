package com.careerit.cj.day2;

import java.util.Scanner;

public class EmiCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount :");
    double amount = sc.nextDouble();
    System.out.println("Enter the rate of interest (%) :");
    double rate = sc.nextDouble();
    System.out.println("Enter the months :");
    int months = sc.nextInt();

    double r = rate / 12 / 100; // monthly rate

    double emi = Math.round(amount * r * (
        (Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1)));

    System.out.println("Amount : " + amount);
    System.out.println("Rate : " + rate + "%");
    System.out.println("Months : " + months);
    System.out.println("EMI : " + emi);
    System.out.println("Total amount to be paid : " + emi * months);
    System.out.println("Total interest : " + (emi * months - amount));

  }
}
