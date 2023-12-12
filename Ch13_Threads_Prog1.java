package com.company;

class MyThread1 extends Thread{
    public void run() {
        int i =0;
        while(i<5) {
            System.out.println("MyThread1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run() {
        int i = 0;
        while (i<5) {
            System.out.println("MyThread2 is Good");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class Ch13_Threads_Prog1 {
    public static void main(String[] args) {
        MyThread1 t1  = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.run();
        t2.run();
    }
}
