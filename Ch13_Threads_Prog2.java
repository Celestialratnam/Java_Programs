package com.company;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am Thread 1 not a threat 1");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am Thread 2 not a threat 2");
    }
}
public class Ch13_Threads_Prog2 {
    public static void main(String[] args) {
    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    Thread gun1 = new Thread(bullet1);

    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    Thread gun2 = new Thread(bullet2);
    gun1.start();
    gun2.start();
    }
}
