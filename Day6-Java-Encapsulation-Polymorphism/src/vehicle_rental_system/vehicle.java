package vehicle_rental_system;

public abstract class vehicle {
     //vehicleNumber, type, and rentalRate
     private String vehicleNumber;
     private int tyre;
     private double rentalRate;

    public vehicle(String vehicleNumber, int tyre, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.tyre = tyre;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    abstract void calculateRentalCost(int days);

}
