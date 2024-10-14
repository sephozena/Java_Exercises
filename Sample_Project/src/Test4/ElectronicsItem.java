package Test4;

public class ElectronicsItem extends Product {
    private String warrantyPeriod;

    public ElectronicsItem(String productName, double productPrice, int productQuantity, String warrantyPeriod) {
        super(productName, productPrice, productQuantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }
}