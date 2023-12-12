package com.company;

    import java.util.Scanner;

    public class Ch1_Prog3
    {
        public static void main(String args[])
        {
            System.out.println("Taking Input from the user");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1: ");
            int number1 = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int number2 = sc.nextInt();
            System.out.print("Enter Number 3: ");
            int number3 = sc.nextInt();

            int sum = number1 + number2 + number3;
            System.out.print("Sum of 3 numbers: "+sum);
        }
    }

