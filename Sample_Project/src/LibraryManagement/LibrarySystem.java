package LibraryManagement;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
            new Book("1984", "George Orwell", 3),
            new Book("To Kill a Mockingbird", "Harper Lee", 2),
            new Book("Moby Dick", "Herman Melville", 1)
        };

        Library library = new Library(books);
        
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. View available books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    try {
                        library.borrowBook(borrowTitle);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                
                case 2:
                    System.out.print("Enter the book title to return: ");
                    String returnTitle = scanner.nextLine();
                    try {
                        library.returnBook(returnTitle);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                
                case 3:
                    library.printAvailableBooks();
                    break;

                case 4:
                    System.out.println("Exiting the library system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}