package LibraryManagement;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void borrowBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Book not found: " + title);
        }
    }
    public void returnBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Book not found: " + title);
        }
    }

    public void printAvailableBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - Available Copies: " + book.getAvailableCopies());
        }
    }
}