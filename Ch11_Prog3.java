package com.company;

public class Ch11_Prog3 {
    public interface Car {
        void turnOnCar();
        void turnOffCar();
        String getCarType();
    }
    public static class ManualCar implements Car {

        private String carType = "Manual";
        @Override
        public void turnOnCar() {
            System.out.println("turn on the manual car");
        }
        @Override
        public void turnOffCar() {
            System.out.println("turn off the manual car");
        }
        @Override
        public String getCarType() {
            return this.carType;
        }
    }
    public static class AutomaticCar implements Car {

        private String carType = "Automatic";
        @Override
        public void turnOnCar() {
            System.out.println("turn on the automatic car");
        }
        @Override
        public void turnOffCar() {
            System.out.println("turn off the automatic car");
        }
        @Override
        public String getCarType() {
            return this.carType;
        }
    }
    public static void main(String[] args) {
        Car car1 = new ManualCar();
        Car car2 = new AutomaticCar();

        car1.turnOnCar();
        car1.turnOffCar();
        System.out.println(car1.getCarType());

        car2.turnOnCar();
        car2.turnOffCar();
        System.out.println(car2.getCarType());
    }
}




