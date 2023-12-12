package com.company;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run() {
        int i = 34;
        System.out.println("Thank You");
//        while (true) {
//            System.out.println("I am Thread ");
//        }
    }
}
public class Ch13_Threads_Prog3 {
    public static void main(String[] args) {
    MyThread t = new MyThread("Celestial");
    MyThread t2 = new MyThread("Ratnam");
    t.start();
    t2.start();
    System.out.println("The Id of the Thread t: "+ t.getId());
    System.out.println("The name of the Thread t: "+ t.getName());
    System.out.println("The Id of the Thread t: "+ t2.getId());
    System.out.println("The name of the Thread t: "+ t2.getName());
    }
}
