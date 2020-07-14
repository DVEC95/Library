import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book("Dune", "Frank Herbert", "Science Fiction");
        library = new Library(3);
        borrower = new Borrower();

        library.addBook(book);
    }

    @Test
    public void hasBooks(){
        assertEquals(0, borrower.bookAmount());
    }

    @Test
    public void canTakeBook(){
        borrower.takeBook(library.singleBook());
        assertEquals(book, borrower.getBorrowedBook());
        assertEquals(0, library.amountOfBooks());
    }
}
