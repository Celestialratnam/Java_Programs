package com.company;

 class Employee{
     int id;
     int salary;
    String name;
    public void PrintDetails(){
        System.out.println("My Id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
     }
}
public class Ch8_Prog1 {
    public static void main(String[] args) {
        // Instantiating a new Employee object
           Employee celestial = new Employee();
           Employee phadrick = new Employee();

        // Setting Attributes
           celestial.id = 22;
           celestial.salary = 35;
           celestial.name = "Ratnam";

           phadrick.id = 17;
           phadrick.salary  = 15;
           phadrick.name = "Fredrick";
         /*Printing Attributes
           System.out.println(celestial.id);
           System.out.println(celestial.name);
           System.out.println(phadrick.id);
           System.out.println(phadrick.name);*/
         celestial.PrintDetails();
         int salary = celestial.getSalary();
         System.out.println("My Salary is: "+salary);
        phadrick.PrintDetails();
        salary = phadrick.getSalary();
        System.out.println("My Salary is: "+salary);
    }
}
