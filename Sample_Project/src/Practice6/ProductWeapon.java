package Practice6;

public class ProductWeapon extends Product{
	
	private String productDamage;
	private String productType;
	
	public ProductWeapon(String productType, String productName, double productPrice, int productQuantity, String productDamage) {
		super(productName, productPrice, productQuantity);
		this.productType = productType;
		this.productDamage = productDamage;
	}

	public String getProductDamage() {
		return productDamage;
	}

	public String getProductType() {
		return productType;
	}

	@Override
	public String toString() {
		return "\n**"+getProductName()+
				"\nPrice: $" + getProductPrice() + "," +
				" Damage: " + getProductDamage() + "," +
				" Quantity: " + getProductQuantity();
	}
}
