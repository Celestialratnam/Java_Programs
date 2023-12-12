package com.company;

class MyNewThr extends Thread
{
    public MyNewThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 0;
        while (true)
        {
            System.out.println("Good Morning");
            System.out.println(getName());
            try {
                Thread.sleep(490);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

    public class Ch13_Threads_Prog5 {
        public static void main(String[] args) {
            MyNewThr t = new MyNewThr("Welcome");
            t.start();
        }
    }