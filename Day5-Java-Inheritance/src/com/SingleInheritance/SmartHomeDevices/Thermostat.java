package com.SingleInheritance.SmartHomeDevices;

//creating subClass: Thermostat extends Device
class Thermostat extends Device{

    protected int temperature;

    Thermostat(int deviceId, String status,int temperature) {
        super(deviceId, status);
        this.temperature=temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void displayDetails(){
        System.out.println("\n----Thermostat Details-----");
        System.out.println("Device ID  :" + deviceId);
        System.out.println("Status     :" + status);
        System.out.println("temperature:" + temperature+ " degree");
    }
}
