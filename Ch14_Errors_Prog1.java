package com.company;

public class Ch14_Errors_Prog1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("We Failed to divide");
            System.out.println(e);
        }
        System.out.println("End of the Program");
        }
    }
