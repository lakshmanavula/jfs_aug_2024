package com.careerit.cj.day4;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number :");
    int num2 = sc.nextInt();
    System.out.println("Enter the third number :");
    int num3 = sc.nextInt();
    /*int big;

    if(num1 > num2 && num1 > num3) {
        big = num1;
    }else if(num2 > num3) {
        big = num2;
    }else{
        big = num3;
    }*/

    // int big = num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3;
    int big = Math.max(num1, Math.max(num2, num3));
    System.out.println("Biggest of "+num1+" and "+num2+" and "+num3+" is :"+big);
  }

}
