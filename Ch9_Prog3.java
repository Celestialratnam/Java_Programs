package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 45;
        name = "Your-name Here";
    }
    public MyMainEmployee(String MyName,int MyId){
        name = MyName;
        id = MyId;
    }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n;}
    public int getId(){ return id; }
    public void setId(int i){ this.id = i;}
}
public class Ch9_Prog3 {
    public static void main(String[] args) {

        MyMainEmployee celestii = new MyMainEmployee("ProgrammingWithCelestii",12);
        // celestii.setName("Celestial Ratnam");
        // celestii.setId(34);
        System.out.println(celestii.getName());
        System.out.println(celestii.getId());
    }
}