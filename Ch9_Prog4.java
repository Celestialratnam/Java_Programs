package com.company;
class MyEmployees{
    private int salary;
    public void setSalary(int i){
        salary = i;
    }
    public int getSalary(){
        return salary;
    }
}
public class Ch9_Prog4 {
    public static void main(String[] args) {
     MyEmployees my = new MyEmployees();
     my.setSalary(10000);
        System.out.println(my.getSalary());
    }
}
