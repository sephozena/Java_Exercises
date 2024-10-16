package Exercise;

public class Product {
	private String productName;
	private String productColor;
	private int productQuantity;
	private double productPrice;
	
	public Product(String productName, String productColor, int productQuantity, double productPrice) {
		// TODO Auto-generated constructor stub
		this.productName = productName;
		this.productColor = productColor;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		
	}

	public String getProductName() {
		return productName;
	}

	public String getProductColor() {
		return productColor;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}
	
	public String getProductType() {
		return "Generic";
	}

	@Override
	public String toString() {
		return "Product Name=" + productName + ", Product Price=" + productPrice;
	}
	
	

}
