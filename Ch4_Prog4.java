package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ch4_Prog4 {
    public static void main(String[] args) {
/*        Question 1
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
*/
     /* Question 2
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths");
        m1 = sc.nextByte();

        System.out.println("Enter the marks of Physics");
        m2 = sc.nextByte();

        System.out.println("Enter the marks of Social");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations,You have been promoted");
        }
        else{
            System.out.println("Sorry,You have not been promoted");
        }*/
//      Question-3
//        float tax=0;
//        System.out.println("Enter income in lakhs");
//        Scanner sc = new Scanner(System.in);
//        float income=sc.nextFloat();
//
//        if(income<250000f){
//            tax = tax+0;
//        } else if (income>250000f && income<=500000f) {
//            tax = tax + 0.05f * (income - 250000f);
//        } else if (income>500000f && income <=1000000f) {
//            tax = tax + 0.05f * (500000f-250000f);
//            tax = tax + 0.2f * (income-500000f);
//        } else if (income>1000000f) {
//            tax = tax + 0.05f * (500000f-250000f);
//            tax = tax + 0.2f * (1000000f-500000f);
//            tax = tax + 0.3f * (income-1000000f);
//        }
//        System.out.println("Total tax paid by the employee is: " +tax);

     /*  Question 4
        int Day;
        System.out.println("Enter the day number of the week: ");
        Scanner sc = new Scanner(System.in);
        Day = sc.nextInt();

        switch (Day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number!! Please enter a valid number:");
        }*/

//          Question-5
        /*System.out.println("Enter an year to check if it is leap year or not: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("It is a Leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }*/

//        Question-6
        System.out.println("Enter an url: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".org")) {
            System.out.println("It is a organizational website");
        }
            else if(website.endsWith(".com")){
            System.out.println("It is a commercial website");
            }
            else if(website.endsWith(".in")){
            System.out.println("It is a Indian website");
        }
    }
}

