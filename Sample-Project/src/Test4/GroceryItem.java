package Test4;

public class GroceryItem extends Product {
    private String expirationDate;

    public GroceryItem(String productName, double productPrice, int productQuantity, String expirationDate) {
        super(productName, productPrice, productQuantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}