package com.company;

public class Ch7_Prog4 {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=n;i++){
                product = product*i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The Value of factorial n is: " + factorial(n));
        System.out.println("The Value of factorial n is: " + factorial_iterative(n));
    }
}
