package com.assistedProblem.VehicleTransportSystem;

//creating subClass: Car extends Vehicle
class Car extends Vehicle{

    //attributes: seatCapacity
    protected int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        setSeatCapacity(seatCapacity);
    }

    //getter and setter
    public void setSeatCapacity(int seatCapacity){
        if(seatCapacity<=10&&seatCapacity>=4){
            this.seatCapacity=seatCapacity;
        }
        else if(seatCapacity>10){
            this.seatCapacity=10;
        }
        else {
            this.seatCapacity=4;
        }
    }

    public int getSeatapacity(){
        return seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("\n-------Vehicle Info-------");
        System.out.println("Vehicle Type  : Car" );
        System.out.println("Max Speed     : " + this.maxSpeed + "Km/h");
        System.out.println("Fuel Type     : " + this.fuelType);
        System.out.println("Seat Capacity : " + this.seatCapacity);
    }
}
