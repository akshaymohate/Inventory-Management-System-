import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private String category;
    private int quantity;

    public Product(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("-----------------------");
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Keyboard", "Electronics", 10);
        Product product2 = new Product("Notebook", "Stationery", 20);

        // Create inventory
        Inventory inventory = new Inventory();

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Display products in the inventory
        inventory.displayProducts();
    }
}
