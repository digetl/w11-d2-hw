import java.util.ArrayList;

public class BorrowerTest {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

}
