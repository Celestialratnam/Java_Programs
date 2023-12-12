package com.company;

class myRectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public myRectangle() {
        this.length = 5;
        this.breadth = 4;
    }
    public myRectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    private double area;
    private double volume;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void SetArea(double d){
        area = d;
    }
    public double getArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public void setVolume(double n){
        volume = n;
    }
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }


}
public class Ch9_Prog5 {
    public static void main(String[] args) {
        //Problem no.1
        /*cylinder c = new cylinder(12,20);
          c.setRadius(12);
          c.setHeight(20);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());*/
       // Problem no.2
       /* cylinder mycylinder = new cylinder(9,12);
        //mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        // mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.getArea());
        System.out.println(mycylinder.getVolume());*/

        myRectangle rec = new myRectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
