package com.company;

public class Ch11_Prog8 {
    interface Bicycle{
        int a = 45;
        void applyBrakes(int decrement);
        void speedUp(int increment);
    }
    interface HornBicycle{
        void BlowHorn();
        void GlowHorn();
    }
    static class AvonCycle implements Bicycle,HornBicycle{
        int speed = 7;
        void blowHorn(int decrement){
            System.out.println("Pee pee Poo Poo");
        }
        public void applyBrakes(int decrement){
            speed = speed - decrement;
            System.out.println("Applying Brake:" + speed );
        }
        public void speedUp(int increment){
            speed = speed + increment;
            System.out.println("Applying speed:" + speed );
        }
        public void BlowHorn(){
            System.out.println("Pee Pooooo Poooo Peeeeee");
        }
        public void GlowHorn(){
            System.out.println("White............(or)Orange....");
        }
    }
    static void show(){
        int num = true ? getNumber() : 20;
        System.out.println("TOMATO=" +num);
    }
    static int getNumber(){
        System.out.println(30);
        return 30;
    }
    public static void main(String[] args) {
        //show();
        AvonCycle ac = new AvonCycle();
        ac.speedUp(3);
        ac.applyBrakes(2);
        System.out.println(ac.a);
        ac.BlowHorn();
        ac.GlowHorn();
    }
}
