package vehicle_rental_system;

public class VehicleRentalSystem3 {
    public static void main(String[] args) {
        Car car=new Car(12,"Indiga",1200);
        car.getInsuranceDetails();

        Bike bike=new Bike(13,"Splendor",800);
        bike.getInsuranceDetails();

        Truck truck=new Truck(14,"Ashok Leyland",1800);
        truck.getInsuranceDetails();
    }
}
