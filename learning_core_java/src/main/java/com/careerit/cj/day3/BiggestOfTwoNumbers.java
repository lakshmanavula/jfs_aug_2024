package com.careerit.cj.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number :");
    int num2 = sc.nextInt();

    if(num1 > num2) {
      System.out.println(num1 + " is biggest number");
    }else {
      System.out.println(num2 + " is biggest number");
    }
  }
}
