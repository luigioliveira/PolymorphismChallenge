package com.company;

abstract class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Starting car's engine.");
    }

    public void accelerate() {
        System.out.println("Accelerating the car.. ");
    }

    public void breakCar() {
        System.out.println("Breaking the car..");
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

}

class Escort extends Car {

    public Escort(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Escort is accelerating..");
    }

    @Override
    public void breakCar() {
        System.out.println("Escort is breaking.. ");
    }

    @Override
    public void startEngine() {
        System.out.println("Escort's engine is starting.");
    }
}

class Fiesta extends Car {
    public Fiesta(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Fiesta is accelerating.. ");
    }

    @Override
    public void breakCar() {
        System.out.println("Fiesta\'s breaking.. ");
    }

    @Override
    public void startEngine() {
        System.out.println("Fiesta\'s engine is starting.. ");
    }
}

class Corsa extends Car {
    public Corsa(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Corsa is accelerating.. ");
    }

    @Override
    public void breakCar() {
        System.out.println("Corsa is breaking.. ");
    }

    @Override
    public void startEngine() {
        System.out.println("Corsa is accelerating.. ");
    }
}

class Palio extends Car {
    public Palio(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Palio is accelerating.. ");
    }

    @Override
    public void breakCar() {
        System.out.println("Palio is braking.. ");
    }

    @Override
    public void startEngine() {
        System.out.println("Palio is staring engine.. ");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car1 = new Escort("Escort XR3", 2);
        Car car2 = new Fiesta("Fiesta", 4);
        Car car3 = new Corsa("Corsa", 3);

        car1.startEngine();
        car1.breakCar();
        car1.accelerate();

        car2.startEngine();
        car2.breakCar();
        car2.accelerate();

        car3.startEngine();
        car3.breakCar();
        car3.accelerate();

    }
}
