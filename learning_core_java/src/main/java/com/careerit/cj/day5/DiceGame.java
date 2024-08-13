package com.careerit.cj.day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

  public static void main(String[] args) {
    // 6 faces => 1 to 6
    int generatedNum = ThreadLocalRandom.current().nextInt(1, 7);
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      System.out.println("Enter your guess number (1 to 6):");
      int userNum = sc.nextInt();
      if (userNum == generatedNum) {
        System.out.println("Good job, you guessed the number in " + i + " attempts");
      } else {
        if(i == 3) {
          System.out.println("Sorry! you have reached maximum attempts, the number is :" + generatedNum);
        }else {
          System.out.println("Try again, you have " + (3 - i) + " attempts left");
        }
      }
    }
  }
}
