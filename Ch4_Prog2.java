package com.company;

public class Ch4_Prog2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("And Operator...");
        if(a && b && c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("OR Operator...");
        if(a || b || c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("NOT Operator");
        System.out.print("Not(A) is ");
        System.out.println(!a);
        System.out.print("Not(B) is ");
        System.out.println(!b);
        System.out.print("Not(C) is ");
        System.out.println(!c);
    }
}
