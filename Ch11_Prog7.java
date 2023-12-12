package com.company;

import com.sun.tools.javac.Main;
class A1{
    public void Test(vehicle v){
        v.start();
    }
}

class vehicle{
    public void start(){ System.out.println("Vehicle Started"); }
}
class car extends vehicle{
    public void start(){
        System.out.println("Car Started");
    }
}
class lorry extends vehicle{
    public void start(){
        System.out.println("Lorry Started");
    }
}
class aeroplane extends vehicle{
    public void start(){
        System.out.println("Aeroplane Started");
    }
}
public class Ch11_Prog7 {
    public static void main(String[] args) {
        A1 a = new A1();
        lorry I = new lorry();
        a.Test(I);
        car c = new car();
        a.Test(c);
//        aeroplane ae = new aeroplane();
//        a.Test(ae);
    }
}
