package com.company;

public class Ch6_Prog2 {
    public static void main(String[] args) {
        int[] marks = {98, 60, 76, 87, 92};
        System.out.println(marks.length);

        //Displaying the Array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        //Displaying the Array(for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
//        //Displaying the Array in reverse order(for loop)
        System.out.println("Printing using reverse order ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        //Displaying the using for each loop
        System.out.println("Printing using for each loop");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
