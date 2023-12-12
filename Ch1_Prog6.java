package com.company;

import java.util.Scanner;

        public class Ch1_Prog6 {
            public static void main(String args[]){
                float eng, phy, soc, math, comp;
                double total, percentage;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter marks of all 5 subjects");
                System.out.print("Enter marks of English subject: ");
                eng = sc.nextFloat();
                System.out.print("Enter marks of physics subject: ");
                phy = sc.nextFloat();
                System.out.print("Enter marks of social subject: ");
                soc = sc.nextFloat();
                System.out.print("Enter marks of maths subject: ");
                math = sc.nextFloat();
                System.out.print("Enter marks of computer subject: ");
                comp = sc.nextFloat();

                total = eng + phy + soc + math + comp;
                percentage = (total/500.0)*100;
                System.out.print(percentage);
            }
        }
