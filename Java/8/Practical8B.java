// multi level inheritance

import java.util.Scanner;
import java.util.Vector;

class Vehicle{
    String fuelType;

    Vehicle(String fuelType){
        this.fuelType = fuelType;
    }

    String getFuelType(){
        return fuelType;
    }
}

class Bike extends Vehicle{
    int noOfWheels;

    Bike(String fuelType,int noOfWheels){
        super(fuelType);
        this.noOfWheels = noOfWheels;
    }

    void displayFuelType(){
        System.out.println("Fuel Type : " + super.getFuelType());
    }

    void displayNoOfWheels(){
        System.out.println("No Of Wheels : " + noOfWheels);
    }
}

class Splendor extends Bike{
    String modelName = "Splendor";

    Splendor(String fuelType,int noOfWheels){
        super(fuelType,noOfWheels);
    }

    void display(){
        System.out.println("\nBike name : " + modelName);
        super.displayFuelType();
        super.displayNoOfWheels();
    }
}

class Practical8B{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fuelType = "Petrol";
        int noOfWheels = 2;

        Splendor b1 = new Splendor(fuelType,noOfWheels);
        b1.display();

    }

}