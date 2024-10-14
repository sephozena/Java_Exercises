package LibraryManagement;

public class Book {
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        if (availableCopies < 0) {
            throw new IllegalArgumentException("Available copies cannot be negative.");
        }
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Borrowed: " + title);
        } else {
            throw new IllegalStateException("No available copies of: " + title);
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Returned: " + title);
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}