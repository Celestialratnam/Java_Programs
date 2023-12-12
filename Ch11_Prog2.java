package com.company;

class hello{
    int id;
    int salary;
    String name;
    public void PrintDetails(){
        System.out.println("My id is: "+id);
        //System.out.println("My salary is:"+salary);
        System.out.println("My name is: "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class Ch11_Prog2 {
    public static void main(String[] args) {
        hello h = new hello();
        h.id = 12;
        //Emp.salary = 32000;
        h.name = "Celestial";

        h.PrintDetails();
        int salary = h.getsalary();
        System.out.println(salary);
    }
}