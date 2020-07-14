import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int bookAmount(){
        return collection.size();
    }

    public void takeBook(Book book){
        collection.add(book);
    }

    public Book getBorrowedBook(){
        return collection.get(0);
    }

}
