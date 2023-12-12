package com.company;

class MyThreads extends Thread{
    public void run(){
        while(true) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class MyThreads2 extends Thread{
    public void run() {
        while (true) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class Ch13_Threads_PracticeSet {
    public static void main(String[] args) {
        MyThreads mt = new MyThreads();
        MyThreads2 mt2 = new MyThreads2();
        mt.start();
        mt2.start();
        System.out.println(mt.getPriority());
        System.out.println(mt2.getPriority());
        System.out.println(mt.getState());
        System.out.println(mt2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
