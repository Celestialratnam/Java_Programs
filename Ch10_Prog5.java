package com.company;
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapko swagat hai");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
        }
public class Ch10_Prog5 {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();//Allowed
        obj.greet();
        obj.on();
        // obj.swagat(); Not Allowed
    }
}

