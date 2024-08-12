package com.careerit.cj.day4;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number :");
    int num2 = sc.nextInt();
    int big = num1 > num2 ? num1 : num2;
    System.out.println("Biggest of " + num1 + " and " + num2 + " is :" + big);
  }
}
