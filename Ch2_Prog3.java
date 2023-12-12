package com.company;

import java.util.Scanner;

public class Ch2_Prog3 {
    public static void main(String args[]){
        int given_number = 98;
        System.out.print("Enter Any number: ");
        Scanner sc = new Scanner(System.in);
        int user_entered_number = sc.nextInt();

        if(given_number>user_entered_number){
            System.out.println("Given Number is Greater");
        }
        else {
            System.out.println("User Number is greater");
        }
    }
}
