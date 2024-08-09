package com.careerit.cj.day1;

import java.util.Scanner;

public class RequiredCabsCalc {

  // Cab capacity is 38
  // Total number of students is 3455889696
  // Find the number of cabs required to pick all the students

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cab capacity :");
    int cabCapacity = sc.nextInt();
    System.out.println("Enter the total number of students :");
    long totalStudents = sc.nextInt();
    long cabsRequired = totalStudents / cabCapacity;
    if (totalStudents % cabCapacity != 0) {
      cabsRequired += 1;
    }
    System.out.println("The number of cabs required to pick all the students is " + cabsRequired);

  }

}
