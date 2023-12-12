package com.company;

import java.util.Scanner;

public class Ch14_ErrorsExceptionPraciticeSet {
    public static void main(String[] args) {
         /*//Problem-1

         //Syntax Error
         int a = 7
         //Logical Error
         int age = 78;
         int year_born = 2000-78;
         //Run time Error
         System.out.println(5/0);*/

        /*// Problem 2
        int a = 666;
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }*/

        // Problem 3
        int marks[] =  new int[3];
        marks[0] = 70;
        marks[1] = 90;
        marks[2] = 80;
        boolean flag = true;
        int i = 0;
        while(flag && i<4){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the index number that you want to use: ");
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>5){
            System.out.println("Error");
        }
    }
}
