package com.company;

import java.util.Scanner;

public class Ch1_Prog5 {
     public static void main(String args[]){

         System.out.println("Calculate the CBSC Percenage");
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter Physics marks: ");
         int physics = sc.nextInt();
         System.out.print("Enter maths marks: ");
         int maths = sc.nextInt();
         System.out.print("Enter social marks: ");
         int social = sc.nextInt();
         System.out.print("Enter Telugu marks: ");
         int Telugu = sc.nextInt();
         System.out.print("Enter computer marks: ");
         int computer = sc.nextInt();

         float percentage =  ((physics + maths + social + Telugu + computer)/500.0f)*100;

         System.out.print("The Percentage is: ");
         System.out.print(percentage);
     }
}
