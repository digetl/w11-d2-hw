import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
//    Book book1;
//    Book book2;
//    Book book3;
//    Book book4;
//    Book book5;

    @Before
    public void setUp() {
        library = new Library("Stockbridge", 5);
    }

    @Test
    public void libraryHasName(){
        assertEquals("Stockbridge", library.getName());
    }

    public void countNumberOfBooksInLibrary() {
        assertEquals(1, library.getNumberOfBooks());
    }

}
