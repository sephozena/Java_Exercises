package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("Cap", "black", 20, 5.50 ));
		productList.add(new Product("Belt", "brown", 20, 3.50 ));
		productList.add(new Product("Short", "brown", 20, 10.50 ));


		productList.add(new ProductFruit("Mango", "Yellow", 25, 3.40, "Fruit"));
		productList.add(new ProductFruit("Apple", "Red", 25, 2.40, "Fruit"));
		productList.add(new ProductFruit("Guava", "Green", 25, 1.40, "Fruit"));
		
		for(Product product : productList) {
			if(product.getProductType().equalsIgnoreCase("generic")) {
				System.out.println("Generic, " + product +"\n");
			}else {
				System.out.println("Fruit " + product.getProductName() + " Quantity: " + product.getProductQuantity());
			}	
		}
	}
}
