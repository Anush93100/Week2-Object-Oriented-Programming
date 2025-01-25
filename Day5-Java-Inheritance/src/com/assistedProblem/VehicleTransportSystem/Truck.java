package com.assistedProblem.VehicleTransportSystem;

//creating subClass: Truck extends Vehicle
class Truck extends Vehicle{

    //attributes: numberOfWheels
    protected int numberOfWheels;

    Truck(double maxSpeed, String fuelType, int numberOfWheels){
        super(maxSpeed,fuelType);
        setNumberOfWheels(numberOfWheels);
    }

    //getter and setter
    public void setNumberOfWheels(int numberOfWheels){
        if(numberOfWheels<=18&&numberOfWheels>=4){
            this.numberOfWheels=numberOfWheels;
        }
        else if(numberOfWheels>18){
            this.numberOfWheels=18;
        }
        else {
            this.numberOfWheels=4;
        }
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    @Override
    public void displayInfo(){
        System.out.println("\n-------Truck Info-------");
        System.out.println("Vehicle Type   : Truck" );
        System.out.println("Max Speed      : " + this.maxSpeed + "Km/h");
        System.out.println("Fuel Type      : " + this.fuelType);
        System.out.println("Number Of Tyre : " + this.numberOfWheels);
    }
}
