package com.careerit.cj.day6;

public class WhileLoopExamples {

  public static void main(String[] args) {
    int num = 12345;
    int rev = reverseOf(num);
    System.out.println("Reverse of " + num + " is " + rev);
  }

  private static int reverseOf(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num = num / 10;
    }
    return rev;
  }
  private static int sumOfDigitsOf(int num){
    int sum = 0;
    while(num != 0){
      int r = num % 10;
      sum += r;
      num = num / 10;
    }
    return sum;
  }
  private static boolean isArmstrong(int num){
    // 153 => 1 ^ 3 + 5 ^ 3 + 3 ^ 3 => 153
    int temp = num;
    int sum = 0;
    while(num != 0){
      int r = num % 10;
      sum += r * r * r;
      num = num / 10;
    }
    return temp == sum;
  }

  private static boolean isPalindrome(int num){
    return num == reverseOf(num);
  }

  private static void printNPrimes(int n){
      int count = 0;
      int i = 2;
      while(n != count){
        if(isPrime(i)){
          System.out.println(i);
          count++;
        }
        i++;
      }
  }

  private static boolean isPrime(int num){
      if(num < 2){
          return false;
      }
      for(int i = 2;i<=num/2;i++){
          if(num % i == 0){
              return false;
          }
      }
      return true;
  }
}
