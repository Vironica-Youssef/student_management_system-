package product_catalog;

public class Product {

    // Private attributes
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    // Constructor initializing all attributes
    public Product(String productId, String productName, double price, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean getInStock() {
        return inStock;
    }

    // Setter methods

    public void setPrice(double newPrice) {
        System.out.println("Current price: "+price );
        if (newPrice<0){
            System.out.println("Error: Price cannot be negative. Update skipped.");
            return;

        }
        price = newPrice;
        System.out.println("Updated price: " + price);
    }

    public void setInStock(boolean status) {
        this.inStock = inStock;
        System.out.println("Current stock status: " + inStock);
        inStock = status;
        System.out.println("New stock status: " + inStock);
    }
}
