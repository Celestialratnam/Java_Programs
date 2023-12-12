package com.company;

class Ekclass{
    int a;
    public void setA(int b){
        this.a = b;
    }
    public int getA(){
        return a;
    }
    Ekclass(){
        System.out.println("I am Ekclass constructor");
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        //super(c);
        System.out.println("I am Doclass constructor");
    }
}
public class Ch10_Prog3 {
    public static void main(String[] args) {
        Ekclass e = new Ekclass();
        e.setA(12);
        System.out.println(e.getA());
        Doclass d = new Doclass(21);
        //System.out.println();
    }
}
