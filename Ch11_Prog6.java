package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class childOfChildOfSampleInterface implements childSampleInterface{
    public void meth1(){
        System.out.println("Method-1");
    }
    public void meth2(){
        System.out.println("Method-2");
    }
    public void meth3(){
        System.out.println("Method-3");
    }
    public void meth4(){
        System.out.println("Method-4");
    }
}
public class Ch11_Prog6 {
    public static void main(String[] args) {
        childOfChildOfSampleInterface c = new childOfChildOfSampleInterface();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
