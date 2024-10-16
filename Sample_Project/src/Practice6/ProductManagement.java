package Practice6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductManagement {

	private List<Product> productList = new ArrayList<Product>(); 
	
	public ProductManagement() {
		
		ProductFood food = new ProductFood("Meat", "Steak", 399, 25, "10-10-24");
		ProductWeapon weapon = new ProductWeapon("Melee", "Dagger", 9999, 50, "Slashing");
		ProductElectronic gadget = new ProductElectronic("Gadget", "Xbox", 750, 10, "1 year");
		Product product = new Product("Belt2", 1.35 , 20);
		
		productList.add(food);
		productList.add(product);
		productList.add(gadget);
		productList.add(weapon);

		productList.add(new Product("Belt", 1.35 , 20));
		productList.add(new Product("Gloves", .75, 25));
		
		productList.add(new ProductFood("Junkfood","Pizza", 50.50, 20, "10-03-24"));
		productList.add(new ProductFood("Vegie", "Asparagus", 10, 20, "10-04-24"));
		productList.add(new ProductFood("Fruit", "Apple", 15, 20, "10-10-24"));
		productList.add(new ProductFood("Fruit", "Mango", 15, 19, "10-10-24"));

		productList.add(new ProductElectronic("Gadget", "Laptop", 750, 10, "1 year"));
		productList.add(new ProductElectronic("Gadget", "Android Phone", 175.35, 30, "6 months"));
		productList.add(new ProductElectronic("Appliance", "TV", 230.50, 50, "15 months"));
		productList.add(new ProductElectronic("Appliance", "Ref", 300.50, 50, "15 months"));
		
		productList.add(new ProductWeapon("Melee", "Claymore", 9999, 50, "Slashing"));
		productList.add(new ProductWeapon("Long Range", "Pistol", 9999, 50, "Piercing"));

	}
	
	public void displayAllProduct() { //String productType
		boolean productFound = false;
		for(Product product : productList) {
//			if(product.getProductType().equalsIgnoreCase(productType)) { // || product.getProductType().contains("Long")
//				System.out.println("Product name: " + product.getProductName() +
//						"\nProduct type: " + product.getProductType() +
//						"\nProduct Quantity: " + product.getProductQuantity()+
//						"\nPrice: "+ product.getProductPrice() +"\n"); 
			System.out.println(product);
				productFound = true;
			}
		}
//		if(!productFound) {
//			System.out.println("'" +productType+ "'" + " Product type not found! Try again.");
//		}
//	}
	
	public void displayDistinctProductType() {
		System.out.println("\nAvailable product types:");
		Set<String> distinctProductType = new HashSet<String>();
		
		//add product types to new set "distinctProductType"
		for(Product product : productList) {
			distinctProductType.add(product.getProductType());
		}
		
		//get the distinct product types 
		for(String productType : distinctProductType) {
			System.out.println("* " + productType);
		}
	}
	
	public void displayInstockProduct() {
		System.out.println("\n****** In-stock products ******");
		for (Product product : productList) {
			if(product.getProductQuantity() > 0) {
				System.out.println("\t"+product.getProductName()+ ": (" +product.getProductQuantity()+")");
			}
		}
	}
	
	
	
	public Product getProductByName(String productName) {
		for (Product product : productList) {
			if (product.getProductName().equalsIgnoreCase(productName)) {
				return product;
			}	
		}
		return null;
	}

}





