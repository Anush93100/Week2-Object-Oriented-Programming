
// creating Product class
class Product{
	static double discount=5;
	String name;
	double price;
	int quantity;
	final int productId;
	 static int count=0;

    //constructor	
	Product(String name, double price, int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		count++;
		this.productId=1000+count;
	}
	
	//method to update discount
	public static void updateDiscount(double discount){
		System.out.println("Updating discount percentage.");
		Product.discount=discount;
	}
	
	//method to display Details
    public static void displayDetails(Product product){
	    if(product instanceof Product){
		    System.out.println("\n-----Product Details-----");
			System.out.println("Product Name  :" + product.name);
			System.out.println("Product ID    :" + product.productId);
			System.out.println("Price         :$" + product.price);
			System.out.println("Discount      :" + product.discount + "%");
			System.out.println("Quantity      :" + product.quantity);
	    }else{
			System.out.println("Given Object is not an instance of Product class");
		}
	}
}

//creating ShoppingCart System class
public class ShoppingCartSystem4{
	public static void main(String[] args){
		
		Product product1=new Product("Table",100,10);
		Product.displayDetails(product1);
		
		Product product2=new Product("chair",150,40);
		Product.displayDetails(product2);
		
		Product.updateDiscount(10);
		System.out.println("After updating discount percentage");
		
	    Product.displayDetails(product1);
	    Product.displayDetails(product2);
	}
}