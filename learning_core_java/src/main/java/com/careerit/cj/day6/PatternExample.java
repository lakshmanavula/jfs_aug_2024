package com.careerit.cj.day6;

public class PatternExample {

  public static void main(String[] args) {

    char ch = 'A';
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
    int s = 9;
    for (int i = 4, j = 3; i >= 1; i--, j--) {
      char temp = (char) (ch - s);
      for (int k = 1; k <= i; k++) {
        System.out.print((char) temp+" ");
        temp++;
      }
      System.out.println();
      s = s + j;
    }
  }
}
