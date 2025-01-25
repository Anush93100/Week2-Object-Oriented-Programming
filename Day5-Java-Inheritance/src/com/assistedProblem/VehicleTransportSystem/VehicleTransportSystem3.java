package com.assistedProblem.VehicleTransportSystem;


public class VehicleTransportSystem3{
    public static void main(String[] args){

        //creating an array of vehicle class
        Vehicle vehicles[]=new Vehicle[3];
        vehicles[0] =new Car(200,"Diesel",6);
        vehicles[1]=new Truck(120,"Diesel",12);
        vehicles[2]=new Motorcycle(160,"Petrol",150);

        //displaying details
        vehicles[0].displayInfo();
        vehicles[1].displayInfo();
        vehicles[2].displayInfo();
    }
}
