package com.company;

public class Ch2_Prog2 {
    public static void main(String args[]){

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting.....
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
