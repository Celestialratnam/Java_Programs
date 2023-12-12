package com.company;

interface myCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k video...");
    }
}
interface myWifi{
    String [] Networks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickUpCall(){
        System.out.println("Connecting...");
    }
}
class mySmartPhone extends myCellPhone implements myWifi,myCamera {
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
//    public void record4kVideo(){
//        System.out.println("Taking snap and recording 4k video");
//    }
    public String [] Networks(){
        System.out.println("Getting List of networks");
        String[] networkList = {"ActFibernet","HathWay","MyJio"};
       // System.out.println(networkList[0]);
        return networkList;

    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class Ch11_Prog5 {
    public static void main(String[] args) {
        mySmartPhone w = new mySmartPhone();
        w.record4kVideo();
        String [] ar = w.Networks();
        for(String item: ar){
            System.out.println(item);
        }
        w.connectToNetwork("Networks");
        w.callNumber(906358698);
        w.pickUpCall();

    }
}
