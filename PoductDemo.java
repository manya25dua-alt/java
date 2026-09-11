class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product() {
        productId = 0; productName = "Unknown"; price = 0; quantity = 0;
    }

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    Product(Product p) {
        this.productId = p.productId;
        this.productName = p.productName;
        this.price = p.price;
        this.quantity = p.quantity;
    }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getQuantity() { return quantity; }

    double calculateAmount() { return price * quantity; }

    void display() {
        System.out.println(productId + " " + productName +
            " Price=" + price + " Quantity=" + quantity +
            " Amount=" + calculateAmount());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(p1);

        p1.display();
        p2.display();

        p2.setQuantity(5);

        System.out.println("After changing copied object:");
        p2.display();

        System.out.println("Original remains:");
        p1.display();
    }
}
