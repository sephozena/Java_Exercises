package Practice;

import java.util.HashSet;

public class ProductManagement {
	
	HashSet<Product> productset = new HashSet<Product>();
	
	public ProductManagement() {
	
	//create product
	productset.add(new Product("Iphone 16 Ultra", 76000, 29));
	productset.add(new Product("Samsung s24", 75000, 15));
	productset.add(new Product("Xiaomi Shark", 34500, 23));
	
	//add product to set
	}
	
	public void viewAvailableProduct() {
		for(Product prod : productset) {
			System.out.println(prod);
		}
	}
	
	
	
}
