package com.company;

import java.util.Scanner;

public class Ch4_Prog3 {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter Your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are Semi experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
    }
    /*int var;
    System.out.println("Enter Your age");
    Scanner sc = new Scanner(System.in);
    var = sc.nextInt();
    switch (var){
        case 18:
            System.out.println("You are going to become an adult");
            break;
        case 23:
            System.out.println("You are going to join in a job");
            break;
        case 60:
            System.out.println("You are going to get retired");
            break;
        default:
            System.out.println("Enjoy your life");
    }
    System.out.println("Learning java !!");*/

}
