package com.company;

class circles{
    public int radius;
    circles(){
        System.out.println("I am circle non parameterised constructor");
    }
    circles(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius  = r;
    }
        public double area(){
            return Math.PI*this.radius*this.radius;
        }
}
class Cylinder extends circles{
        public int height;
        Cylinder(int r,int h){
            super(r);
            System.out.println("I am cylinder parameterised constructor");
            this.height = h;
        }
        public double volume(){
            return Math.PI*this.radius*this.radius*height;
        }
}
public class Ch10_Prog7 {
    public static void main(String[] args) {
          /*circles c = new circles(12);
          System.out.println(c.area());*/
          Cylinder cy = new Cylinder(12,13);
          System.out.println(cy.volume());
    }
}
