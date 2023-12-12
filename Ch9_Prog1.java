package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Ch9_Prog1 {
    public static void main(String[] args) {

        MyEmployee me = new MyEmployee();
        me.setName("Celestial");
        System.out.println(me.getName());
        me.setId(34);
        System.out.println(me.getId());
    }
}
