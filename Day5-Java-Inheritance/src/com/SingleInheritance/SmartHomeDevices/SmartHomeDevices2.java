package com.SingleInheritance.SmartHomeDevices;

public class SmartHomeDevices2{
    public static void main(String[] args){
        Device device=new Device(101,"Connected");
        device.displayDetails();

        Thermostat thermostat=new Thermostat(104, "Connected", 25);
        thermostat.displayDetails();
    }
}
