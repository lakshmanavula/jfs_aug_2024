package com.careerit.cj.day3;

import java.util.Scanner;

public class DiscountCalculation {

  // If the amount is greater than 1000 then give 10% discount

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount :");
    double amount = sc.nextDouble();
    double discount = 0;

    if(amount > 1000) {
        discount = amount * 0.10;
    }

    double finalAmount = amount - discount;

    System.out.println("Amount : " + amount);
    System.out.println("Discount : " + discount);
    System.out.println("Final amount : " + finalAmount);

  }

}
