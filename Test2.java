
// Interface
interface StoredItem {
    void displayDetails();
}

// Abstract class
abstract class Stationary {
    abstract double calculatePrice();
}

// Concrete class implementing the interface and extending the abstract class
class StationaryItem extends Stationary implements StoredItem {
    private String title;
    private String author;
    private double price;

    // Constructor with no parameters
    public StationaryItem() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with title and author parameters
    public StationaryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with all parameters
    public StationaryItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Implementing displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Implementing calculatePrice method
    @Override
    public double calculatePrice() {
        // Example price calculation logic
        return price * 1.1; // Adding 10% tax
    }
}

// Main class
public class Test2 {
    public static void main(String[] args) {
        // Creating objects
        StationaryItem item1 = new StationaryItem();
        StationaryItem item2 = new StationaryItem("Notebook", "John Doe");
        StationaryItem item3 = new StationaryItem("Pen", "Jane Doe", 15.0);

        // Displaying details and prices
        System.out.println("Item 1:");
        item1.displayDetails();
        System.out.println("Calculated Price: $" + item1.calculatePrice());

        System.out.println("\nItem 2:");
        item2.displayDetails();
        System.out.println("Calculated Price: $" + item2.calculatePrice());

        System.out.println("\nItem 3:");
        item3.displayDetails();
        System.out.println("Calculated Price: $" + item3.calculatePrice());
    }
}

