package com.SingleInheritance.SmartHomeDevices;


//creating superClass:  Device
class Device{

    //attributes
    protected int deviceId;
    protected String status;

    //parameterized constructor
    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    //getter and setter
    public void setDeviceId(int deviceId){
        this.deviceId=deviceId;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public int getdeviceId(){
        return deviceId;
    }

    public String getStatus(){
        return status;
    }

    public void displayDetails(){
        System.out.println("\n----Device Details-----");
        System.out.println("Device ID :" + deviceId);
        System.out.println("Status    :" + status);
    }
}
