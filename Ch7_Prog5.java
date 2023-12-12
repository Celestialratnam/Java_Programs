package com.company;

public class Ch7_Prog5 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static int pattern2(int n){
        for ( int i = 0; i<n ; i++){
            for(int j = n; j>i ; j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        return n;
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static int pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        //Practice Ques-1
         int n=5;
         multiplication(n);

        //Practice Ques-2
        pattern1(5);

        //Practice Ques-3
        int c = sumRec(5);
        System.out.println(c);

       // Practice Ques-4
        int P2 = pattern2(5);

       // Practice Ques-5
        int result = fib(5);
        System.out.println(result);

       // Practice Ques-7
        pattern_rec(9);
    }
}
