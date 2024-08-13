package com.careerit.cj.day5;

public class ANumberQuestions {


  public static void main(String[] args) {
      printPattern(5);
  }

  private static int countPrimes(int lb, int ub) {
    return 0;
  }

  private static int sumOfPrimes(int lb, int ub) {
    return 0;
  }

  private static int countOfFactors(int num) {
    return 0;
  }

  private static void printPattern(int n) {
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  private static void printPattern(int n, char ch) {
    // A
    // A B
    // A B C
    // A B C D
    // A B C D E
  }

  private static void printPattern(int n, int start) {
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
  }

  private static void printPattern(int n, int start, char ch) {
    // A
    // B C
    // D E F
    // G H I J
    // K L M N O
  }

  private static void printPattern(int n, int start, char ch, int diff) {
    // A
    // C E
    // G I K
    // M O Q S
    // U W Y A C
  }

  private static void printPatterns(int n, int start) {
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    // 11 12 13 14
    // 7 8 9 10
    // 4 5 6
    // 2 3
    // 1
  }

  private static void printPatterns(int n, int start, char ch) {
    // A
    // B C
    // D E F
    // G H I J
    // K L M N O
    // K L M N
    // G H I J
    // D E F
    // B C
    // A
  }
}
