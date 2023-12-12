package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank You "+ this.getName());
//        while(true){
//            System.out.println("Thank You "+ this.getName());
//        }
    }
}
public class Ch13_Threads_Prog4 {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Celestial1");
    MyThr t2 = new MyThr("Celestial2");
    MyThr t3 = new MyThr("Celestial3");
    MyThr t4 = new MyThr("Celestial4");
    MyThr t5 = new MyThr("Celestial5 (Most Important)");
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    }
}
