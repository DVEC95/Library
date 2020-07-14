import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int amountOfBooks(){
        return books.size();
    }

    public int getCapacity(){
        return capacity;
    }

    public void addBook(Book book){
        if(amountOfBooks() < getCapacity()){
            books.add(book);
        }
    }

    public Book singleBook(){
        return books.remove(0);
    }

}

