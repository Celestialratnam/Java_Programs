package com.company;

public class Ch14_FinallyBlockProg {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the function");
        }
        return -1;
    }
    public static void main(String[] args) {
    int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the value of b = " + b);
            }
            b--;
        }
        try{
            System.out.println(5/0);
        }
        /*catch (Exception e){
            System.out.println(e);
        }*/
        finally {
            System.out.println("I am finally");
        }
    }
}
