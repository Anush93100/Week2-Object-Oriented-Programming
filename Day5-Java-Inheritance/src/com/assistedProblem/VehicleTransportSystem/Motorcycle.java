package com.assistedProblem.VehicleTransportSystem;


//creating subClass: Motorcycle extends Vehicle
class Motorcycle extends Vehicle{

    //attributes: power
    protected int power;

    Motorcycle(double maxSpeed, String fuelType, int power){
        super(maxSpeed,fuelType);
        setPower(power);
    }

    //getter and setter
    public void setPower(int power){
        if(power<=250&&power>=100){
            this.power=power;
        }
        else if(power>250){
            this.power=250;
        }
        else {
            this.power=100;
        }
    }

    public int getPower(){
        return power;
    }

    @Override
    public void displayInfo(){
        System.out.println("\n-------Motorcycle Info-------");
        System.out.println("Vehicle Type : Motorcycle" );
        System.out.println("Max Speed    : " + this.maxSpeed + "Km/h");
        System.out.println("Fuel Type    : " + this.fuelType);
        System.out.println("Power        : " + this.power + "cc");
    }
}
