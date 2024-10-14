package Practice6;

public class ProductFood extends Product {
	private String productExpiration;
	private String productType;

	public ProductFood(String productName, double productPrice, int productQuantity) {
		super(productName, productPrice, productQuantity);
	}

	public ProductFood(String productType, String productName, double productPrice, int productQuantity, String productExpiration) {
		super(productName, productPrice, productQuantity);
		this.productExpiration = productExpiration;
		this.productType = productType;
	}

	public String getProductExpiration() {
		return productExpiration;
	}

	@Override
	public String getProductType() {
		return productType;
	}

	@Override
	public String toString() {
		return  "\n**"+getProductName()+ 
				"\nPrice: $" + getProductPrice() + "," +
				" Validity: " + getProductExpiration() +"," +
				" Quantity: " + getProductQuantity();
	}
}
