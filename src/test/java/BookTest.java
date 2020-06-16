import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void setUp() {
        book1 = new Book("The Beast of Buckingham Palace", "David Walliams", "Childrens Fiction");
        book2 = new Book("Slime", "David Walliams", "Childrens Fiction");
        book3 = new Book("Fing", "David Walliams", "Childrens Fiction");
        book2 = new Book("Dog Zombies Rule", "Liz Pichon", "Childrens Fiction");
        book2 = new Book("Spectacular School Trip", "Liz Pichon", "Non Fiction");
        book2 = new Book("Everthing's Amazing", "Liz Pichon", "Autobiography");
    }

        @Test
        public void bookHasTitle(){
        assertEquals("Slime", book2.hasName());
        }






}
