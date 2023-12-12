package com.company;

class Base1{
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){
        System.out.println("I am a base class constructor with a value of x: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a derived class constructor with a value of y: " + y);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived class constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child of derived class constructor with a value of z: " + z);
    }
}
public class Ch10_Prog2 {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14,9);
        // childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(12,13,14);
    }
}
