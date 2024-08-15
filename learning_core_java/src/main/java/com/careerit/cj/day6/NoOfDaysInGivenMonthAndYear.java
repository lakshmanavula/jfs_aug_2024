package com.careerit.cj.day6;

public class NoOfDaysInGivenMonthAndYear {

  public static void main(String[] args) {
    int year = 2021;
    int month = 8;
    int days = noOfDaysIn(year, month);
    String monthName = monthName(month);
    System.out.println("No of days in " + monthName + " month of " + year + " is " + days);
  }

  public static String monthName(int month) {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    return months[month - 1];
  }

  public static int noOfDaysIn(int year, int month) {
    int days = 0;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 2:
        days = isLeapYear(year) ? 29 : 28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      default:
        days = 0;
    }
    return days;
  }

  public static int noOfDaysInUsingSwitchExp(int year, int month) {
    return switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 2 -> isLeapYear(year) ? 29 : 28;
      case 4, 6, 9, 11 -> 30;
      default -> 0;
    };
  }

  private static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
