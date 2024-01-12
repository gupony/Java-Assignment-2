import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int quantity;

    public Book(String title, String author, String ISBN, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getQuantity() {
        return quantity;
    }
}

class CuteInventoryManager {
    private ArrayList<Book> inventory;

    public CuteInventoryManager() {
        this.inventory = new ArrayList<>();
    }

    public void addBook(String title, String author, String ISBN, int quantity) {
        Book newBook = new Book(title, author, ISBN, quantity);
        inventory.add(newBook);
        System.out.println("Yay! The book '" + title + "' by " + author + " has been added to your cute inventory!");
    }

    public void displayInventory() {
        System.out.println("📚 Your Cute Book Inventory 📚");

        if (inventory.isEmpty()) {
            System.out.println("Oops! Your cute inventory is empty. Add some adorable books!");
        } else {
            for (Book book : inventory) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Quantity: " + book.getQuantity());
                System.out.println("------------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CuteInventoryManager cuteInventoryManager = new CuteInventoryManager();

        System.out.println("🌸 Welcome to Cute Book Manager! 🌸");

        while (true) {
            System.out.println("1. Add an adorable book");
            System.out.println("2. Display your cute book inventory");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("📖 Enter details for the adorable book:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    // Add
                    cuteInventoryManager.addBook(title, author, ISBN, quantity);
                    break;

                case 2:
                    // Display
                    cuteInventoryManager.displayInventory();
                    break;

                case 3:
                    // Exit
                    System.out.println("Thank you for using Cute Book Manager! 🌈");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
