package Exercise;

public class ProductFruit extends Product{
	private String productType;

	public ProductFruit(String productName, String productColor, int productQuantity, double productPrice, String productType) {
		super(productName, productColor, productQuantity, productPrice);
		this.productType = productType;
	}
	
	@Override
	public String getProductType() {
		return productType;
	}

	@Override
	public String toString() {
		return "Product Name: " + getProductName() + "\nProduct Price: " + getProductPrice();
	}

}
