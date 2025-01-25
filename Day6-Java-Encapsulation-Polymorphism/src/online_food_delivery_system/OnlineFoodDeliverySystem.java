package online_food_delivery_system;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem food1=new VegItem("Aalo ke parathe",40,5);
        food1.getItemDetails();
        food1.getDiscountDetails();
        food1.calculateTotalPrice();

        NonVegItem food2=new NonVegItem("Butter Chicken",150,2);
        food2.getItemDetails();
        food2.getDiscountDetails();
        food2.calculateTotalPrice();
    }
}
