package com.careerit.cj.day1;

import java.util.Scanner;

public class LeapYearExample {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year:");
    int year = sc.nextInt();

    // leap year condition
    // 1. Year should be divisible by 4
    // 2. Year should not be divisible by 100
    // 3. Year should be divisible by 400

    if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
      System.out.println(year + " is a leap year");
    }else {
      System.out.println(year + " is not a leap year");
    }

  }
}
