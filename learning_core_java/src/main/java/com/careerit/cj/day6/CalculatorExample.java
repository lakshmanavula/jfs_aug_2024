package com.careerit.cj.day6;

import java.util.Scanner;

public class CalculatorExample {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("Enter the num1 :");
      int num1 = sc.nextInt();
      System.out.println("Enter the num2 :");
      int num2 = sc.nextInt();
      System.out.println("Enter the operation (+,-,*,/,%):");
      char ch = sc.next().charAt(0);
      switch (ch) {
        case '+':
          System.out.println("The sum of " + num1 + " and " + num2 + " is :" + (num1 + num2));
          break;
        case '-':
          System.out.println("The sub of " + num1 + " and " + num2 + " is :" + (num1 - num2));
          break;
        case '*':
          System.out.println("The mul of " + num1 + " and " + num2 + " is :" + (num1 * num2));
          break;
        case '/':
          if (num2 == 0) {
            System.out.println("Denominator should not be zero");
          } else {
            System.out.println("The div of " + num1 + " and " + num2 + " is :" + (num1 / num2));
          }
          break;
        case '%':
          if (num2 == 0) {
            System.out.println("Denominator should not be zero");
          } else {
            System.out.println("The mod of " + num1 + " and " + num2 + " is :" + (num1 % num2));
          }
          break;
        default:
          System.out.println("Invalid operation");
      }
      sc.nextLine();
      System.out.println("Do you want to continue (yes/no):");
      String choice = sc.nextLine();
      if(!choice.equalsIgnoreCase("yes")) {
        break;
      }
    }
  }
}
