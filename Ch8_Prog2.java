package com.company;

class Employees{
            int salary;
          String name;
            public int getSalary(){
                return salary;
            }
            public String getName(){
                 return name;
            }
            public void setName(String n){
               name = n;
            }
}
class cellphone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callfriend(){
        System.out.println("Calling friend......");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l*b);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class circle{
    int r;
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r;
    }
}
public class Ch8_Prog2 {
    public static void main(String[] args) {

        // Problem-1
        Employees celestial = new Employees();
        celestial.salary = 235;
        celestial.setName("Ratnam");
        System.out.println(celestial.getName());
        System.out.println(celestial.getSalary());

        // Problem-2
        cellphone redmi = new cellphone();
        redmi.callfriend();
        redmi.ring();
        redmi.vibrate();

        //Problem-3
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Problem-4
        rectangle rec = new rectangle();
        rec.l = 5;
        rec.b = 3;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

        // Problem-5
       Tommy tm = new Tommy();
        tm.fire();
        tm.hit();
        tm.run();

        // Problem-6
        circle c = new circle();
        c.r = 5;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
