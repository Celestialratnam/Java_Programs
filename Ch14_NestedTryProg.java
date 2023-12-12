package com.company;

import java.util.Scanner;

public class Ch14_NestedTryProg {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 66;
        marks[1] = 56;
        marks[2] = 70;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the Value Array index: ");
            int ind = sc.nextInt();
            //int number = sc.nextInt();
            try {
                System.out.println("Welcome to Nested Try Concept");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry the index does not exist");
                    System.out.println("Exception at level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception at level 1");
            }
            System.out.println("Thanks for using this program");
        }
    }
}