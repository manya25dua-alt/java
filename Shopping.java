class Product{
    String name;
    double price;
    int quantity;
    Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }
    double calcPrice(){
        return price*quantity;

    }


}
class ShoppingCart{
    Product[] products;
    int count=0;

    ShoppingCart(int size) {
        products=new Product[size];
        count=0;
    }
    void addProduct(Product p){
        if(count<products.length){
            products[count] = p;
            count++;
        }
        else {
            System.out.println("Cart is full!");
        }
    }
     double calculateSubtotal() {
        double subtotal = 0;

        for (int i = 0; i < count; i++) {
            subtotal += products[i].calcPrice();
        }

        return subtotal;
    }

    double calculateDiscount() {
        double subtotal = calculateSubtotal();

        if (subtotal < 1000) {
            return 0;
        } else if (subtotal < 5000) {
            return subtotal * 0.10;
        } else {
            return subtotal * 0.20;
        }
    }
     double calculateFinalAmount() {
        return calculateSubtotal() - calculateDiscount();
    }

    void displayCart() {
        System.out.println("Subtotal: Rs. " + calculateSubtotal());
        System.out.println("Discount: Rs. " + calculateDiscount());
        System.out.println("Final amount: Rs. " + calculateFinalAmount());
    }
    
}
public class Shopping {
    public static void main(String[] args) {
         Product p1 = new Product("Keyboard", 1500, 2);
        Product p2 = new Product("Mouse", 500, 2);

        ShoppingCart cart = new ShoppingCart(5);

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.displayCart();
    }
}
