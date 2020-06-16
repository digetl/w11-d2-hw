import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> stock;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBooks() {
        return this.stock.size();
    }

    public void addBook(Book book1) {
        if (this.getNumberOfBooks() < this.capacity) {
            this.stock.add(book1);
        }
    }
}

////MVP
//Books should have title, author and genre.
//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check if stock is full before adding a book.
//Extensions:
//Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.
//Advanced Extension
//The library wants to keep track of it's number of books by genre. Using a HashMap, store the genre of each book as the key - and a count of how many books of that genre as the value.
