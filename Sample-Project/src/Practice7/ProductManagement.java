package Practice7;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
	
	private List<Product> productList = new ArrayList<Product>();
	
	public ProductManagement() {
		
		productList.add(new ProductElectronic("gadget", "laptop", 1500, 5, "1 year"));
		productList.add(new ProductElectronic("gadget", "cp", 1500, 5, "6 months"));

		productList.add(new Product("belt", 50, 5));
		productList.add(new Product("hat", 50, 5));
	}
	
	public void displayAllProduct() {
		System.out.println("available products: ");

		for (Product product : productList) {
			System.out.println(product.getProductName());
			
		}
	}
	
}
