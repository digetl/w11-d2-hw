import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void setUp() {
        library = new Library("Stockbridge", 4);

        book1 = new Book("Slime", "David Walliams", "Childrens Fiction");
        book2 = new Book("Slime1", "David Walliams", "Childrens Fiction");
        book3 = new Book("Slime2", "David Walliams", "Childrens Fiction");
        book4 = new Book("Slime3", "David Walliams", "Childrens Fiction");
        book5 = new Book("Slime", "David Walliams", "Childrens Fiction");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Stockbridge", library.getName());
    }

    @Test
    public void countNumberOfBooksInLibrary() {
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }
    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());

    }
    @Test
    public void checkIfLibraryIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.getNumberOfBooks());
    }

}
