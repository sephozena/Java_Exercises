package Test2;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient stock for " + name);
        }
    }

    public void displayItem() {
        System.out.println(name + " - $" + price + " (Stock: " + quantity + ")");
    }
}
