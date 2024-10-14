package Test7;

public class Product {
    private String name;
    private double price;
    private String customizationOptions;

    public Product(String name, double price, String customizationOptions) {
        this.name = name;
        this.price = price;
        this.customizationOptions = customizationOptions;
    }

    // Getters and setters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCustomizationOptions() { return customizationOptions; }
    
    public void setCustomizationOptions(String customizationOptions) {
        this.customizationOptions = customizationOptions;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " Customization: " + customizationOptions;
    }
}
