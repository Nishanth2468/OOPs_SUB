// Custom Exception for Book Availability
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Custom Exception for Borrowing Limit
class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}

public class LibrarySystem {
    private int copiesAvailable = 2;
    private int booksBorrowed = 3;

    public void borrowBook() throws BookNotAvailableException, LimitExceededException {
        if (copiesAvailable == 0) {
            throw new BookNotAvailableException("Book not available for borrow!");
        }
        if (booksBorrowed >= 3) {
            throw new LimitExceededException("Borrowing limit exceeded!");
        }
        copiesAvailable--;
        booksBorrowed++;
        System.out.println("Book borrowed successfully. Copies left: " + copiesAvailable);
    }

    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();
        try {
            lib.borrowBook(); // Triggers LimitExceededException
        } catch (BookNotAvailableException bn) {
            System.out.println("Error: " + bn.getMessage());
        } catch (LimitExceededException le) {
            System.out.println("Error: " + le.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}
