package vehicle_rental_system;

import ecommerceplatform.Product;

public class Truck extends Product implements Insurable {
    int insuarance;
    public Truck(int productId, String name, double price) {
        super(productId, name, price);
        this.insuarance=0;
    }

    @Override
    public void calculateInsurance() {
        this.insuarance=5;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()/10;
    }

    @Override
    public void getInsuranceDetails() {
        calculateInsurance();
        System.out.println("Insuarance percentage for truck :" + insuarance);
    }
}
