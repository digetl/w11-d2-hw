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
        library = new Library("Stockbridge", 0);
//        book1 = Book();
//        book2 = Book();
//        book3 = Book();
//        book4 = Book();
//        book5 = Book();
    }

    @Test
    public void libraryHasName(){
        assertEquals("Stockbridge", library.getName());
    }


}
