import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Dune", "Frank Herbert", "Science Fiction");
        book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book3 = new Book("Don Quixote", "Miguel de Cervantes", "Classics");
    }

    @Test
    public void hasBooks(){
        assertEquals(0, library.amountOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.amountOfBooks());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.amountOfBooks());
    }

}
