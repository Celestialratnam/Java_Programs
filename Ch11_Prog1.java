package com.company;

public class Ch11_Prog1 {
    static String Employee_name;
    static float Employee_salary;
    static void set(String n,float p){
        Employee_name = n;
        Employee_salary = p;
    }
    static void get(){
        System.out.println("Employee name is: "+ Employee_name);
        System.out.print("Employee salary is: "+ Employee_salary);
    }
    public static void main(String[] args) {
        Ch11_Prog1.set("Celestial",29998.2f);
        Ch11_Prog1.get();
    }
}

