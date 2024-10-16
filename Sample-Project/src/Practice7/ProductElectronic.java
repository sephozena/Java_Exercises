package Practice7;

public class ProductElectronic extends Product{
	private String productWarranty;
	private String productType;
	
//	public ProductElectronic(String productName, double productPrice, int productQuantity) {
//		super(productName, productPrice, productQuantity);
//	}
	
	
	public ProductElectronic(String productType, String productName, double productPrice, int productQuantity, String productWarranty) {
		super(productName, productPrice, productQuantity);
		this.productWarranty = productWarranty;
		this.productType = productType;
	}
	
	public String getProductWarranty() {
		return productWarranty;
	}

	@Override
	public String getProductType() {
		return productType;
	}


	@Override
	public String toString() {
		return "ProductElectronic [productWarranty=" + productWarranty + ", productType=" + productType + "]";
	}

}

