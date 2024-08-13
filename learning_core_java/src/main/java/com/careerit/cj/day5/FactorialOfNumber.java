package com.careerit.cj.day5;

public class FactorialOfNumber {

  public static void main(String[] args) {

      int num = 6;
      int fact = 1;

      int i = 2;
      while(i <= num) {
          fact *= i;
          i++;
      }
      System.out.println("Factorial of "+num+" is :"+fact);
  }
}
