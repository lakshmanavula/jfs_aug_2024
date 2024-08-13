package com.careerit.cj.day5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BreakAndContinueExample {


  public static void main(String[] args) {

    // Generate the first n prime numbers

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N value :");
    int N = sc.nextInt();
    int count = 0;
    for (int i = 2; ; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
        count++;
      }
      if (count == N) {
        break;
      }
    }
  }

  // 1 30 => print numbers which are not divisible by 3
  private static void showFilteredNumbers(int lb, int ub) {

    for (int i = lb; i <= ub; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }
  }

  private static boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static void showGreetings(String username) {
    System.out.println("Hello " + username + " have a nice day");
  }

  private static String getSystemInfo() {
    return "OS : Mac, RAM : 16GB, Processor : i7";
  }

  private static void showSystemDateTime() {
    System.out.println("Current date and time is :" + LocalDateTime.now());
  }
}
