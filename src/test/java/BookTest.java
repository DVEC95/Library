import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
       book = new Book("Dune", "Frank Herbert", "Science Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Dune", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Frank Herbert", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Science Fiction", book.getGenre());
    }

}
