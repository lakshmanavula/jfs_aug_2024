package com.careerit.cj.day1;

public class SumAndAvgOfThreeNumbers {

  public static void main(String[] args) {

      // Read the three numbers from the command line arguments
      /*int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int num3 = Integer.parseInt(args[2]);*/

      int num1 = 15;
      int num2 = 25;
      int num3 = 33;

      // Calculate the sum of the three numbers
      int sum = num1 + num2 + num3;
      float avg = sum / 3.0f; // 3.0f is a float value

      // Print the sum and average of the three numbers
      System.out.println("The sum of "+num1+", "+num2+" and "+num3+" is "+sum);
      System.out.println("The average of "+num1+", "+num2+" and "+num3+" is "+avg);

  }
}
