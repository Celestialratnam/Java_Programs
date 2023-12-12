package com.company;
// Question 1 & 2
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println(" Writing");
    }
    void refill(){
        System.out.print("Refilling and");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
// Question 3
interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
     void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends monkey implements basicAnimal{
    public void speak(){
        System.out.println("Hello Sir");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
abstract class Telephone{
     void ring(){
         System.out.println("Ringing the call");
    }
    void lift(){
        System.out.println("Lifting the call");
    }
    void disconnect(){
        System.out.println("Disconnecting the call");
    }
}
class smartPhone extends Telephone{
    void videos(){
        System.out.println("Watching youtube Videos");
    }
}
// Question 6
interface TvRemote{
    void buttons();
}
interface SmartTvRemote extends TvRemote{
    void Ott();
    void Hdmi();
    void Fast();
}
class Tv implements TvRemote,SmartTvRemote{
    public void buttons(){
        System.out.println("We use TvRemote buttons to interact with Tv");
    }
    public void Ott(){
        System.out.println("Ott Platforms are available");
    }
    public void Hdmi(){
        System.out.println("We can use PenDrive in this Smart Tv");
    }
    public void Fast(){
        System.out.println("Smart Tv is super fast when compared to Normal Tv");
    }
}
public class Ch11_Prog9 {
    public static void main(String[] args) {
    /* Question 1 & 2
    FountainPen pen = new FountainPen();
    pen.changeNib();
    pen.refill();
    pen.write();*/
    /* Question 3
        Human h = new Human();
        h.sleep();
        h.speak();
        h.bite();
        h.eat();
        h.jump();*/
        /* Question 4
         Telephone t = new smartPhone();
        t.ring();
        t.lift();
        t.disconnect();*/
        // Question 5
        monkey m = new Human();
        m.jump();
        m.bite();
        // Question 6 & 7
        SmartTvRemote v = new Tv();
        v.buttons();
        v.Fast();
        v.Hdmi();
        v.Ott();
    }
}
