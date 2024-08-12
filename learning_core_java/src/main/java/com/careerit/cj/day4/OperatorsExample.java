package com.careerit.cj.day4;

public class OperatorsExample {

  public static void main(String[] args) {

    boolean a = true, b = false, c = true, d = false;

    if (a || (b = true) || c) {
      System.out.println("Hello");
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
