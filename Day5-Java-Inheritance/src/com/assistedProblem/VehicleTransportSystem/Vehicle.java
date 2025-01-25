package com.assistedProblem.VehicleTransportSystem;


//creating superClass: Vehicle
class Vehicle{
    //attributes: maxspeed, fuelType
    protected double maxSpeed;
    protected String fuelType;

    Vehicle(double maxSpeed, String fuelType){
        setMaxSpeed(maxSpeed);
        setFuelType(fuelType);
    }

    //method to display Info
    public void displayInfo(){
        System.out.println("\n-----Vehicle Info-----");
        System.out.println("Max Speed  : " + this.maxSpeed + "Km/h");
        System.out.println("Fuel Type  : " + this.fuelType);
    }

    //getter and setter
    public void setMaxSpeed(double maxSpeed){
        if(maxSpeed<=200&&maxSpeed>=20){
            this.maxSpeed=maxSpeed;
        }
        else if(maxSpeed>200){
            this.maxSpeed=200;
        }
        else if(maxSpeed<20){
            this.maxSpeed=20;
        }
    }

    public void setFuelType(String fuelType){
        if(fuelType.equals("Petrol")){
            this.fuelType=fuelType;
        }
        else{
            this.fuelType="Diesel";
        }
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public String getFuelType(){
        return fuelType;
    }
}
