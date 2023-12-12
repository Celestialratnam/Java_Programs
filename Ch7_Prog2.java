package com.company;

public class Ch7_Prog2 {
    static void change(int a){
        a =98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new world!\n" +
                "Plagiarism");
    }

    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a +" bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " to "+ b +" bro!");
    }
    public static void main(String[] args) {
         tellJoke();

        // Case 1: Changing the integer
         int x = 45;
         change(x);
         System.out.println("The value of x after changing is: " + x);

        // Case 2: Changing the Array
         int [] arr = {53,78,96,58,67,49};
         change2(arr);
         System.out.println("The value of x after changing is: " + arr[0]);
         for(int i=0; i< arr.length; i++){
             System.out.println(arr[i]);
          }
        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);
    }
}
