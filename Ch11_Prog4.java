package com.company;

    abstract class base{
    public base(){
            System.out.println("I am a constructor");
        }
        public void sayHello(){
            System.out.println("Hello");
        }
        abstract public void greet();
        abstract public void greet2();
    }
    class child extends base{
        public void greet(){
            System.out.println("Good Morning");
        }
        public void greet2(){
            System.out.println("Good Afternoon");
        }
    }
    abstract class child1 extends base{
        public void AreYouFine(){
            System.out.println("Yes,I am good");
        }
    }
public class Ch11_Prog4 {
    public static void main(String[] args) {
        child  c = new child();
    }
}
