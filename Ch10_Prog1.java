package com.company;

class Animal{
    int a;
    public int getA() {
        System.out.println("I was born in ");
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
class Dog extends Animal{
    int b;
    public int getB() {
        System.out.println("I was born in ");
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am setting X");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am setting Y");
        this.y = y;
    }
}
public class Ch10_Prog1 {
    public static void main(String[] args) {
    Base b = new Base();
    b.setX(27);
        System.out.println(b.getX());

    // Creating an object for a derived class
     Derived d = new Derived();
     d.setY(13);
        System.out.println(d.getY());

    /*Animal an = new Animal();
    an.setA(2001);
        System.out.println(an.getA());

    Dog dc = new Dog();
    dc.setB(2002);
        System.out.println(dc.getB());*/
    }
}
