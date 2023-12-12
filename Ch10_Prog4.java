package com.company;

class A{
    int a;
    public void meth2(){
        System.out.println("I am method 2 from class A");
    }
}
class B extends A{
    int b;
    @Override
    public void meth2(){
        System.out.println("I am method 2 from class B");
    }
    public void meth3(){
        System.out.println("I am method 3 from class B");
    }
}
public class Ch10_Prog4 {
    public static void main(String[] args) {
      A a = new A();
        a.meth2();

      B b = new B();
        b.meth2();
    }
}
