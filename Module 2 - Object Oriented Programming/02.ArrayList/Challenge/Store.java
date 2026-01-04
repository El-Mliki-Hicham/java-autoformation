import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private ArrayList<Book> listBooks  ;



    public Store() {
        this.listBooks = new ArrayList<>();
    }

    public Book getBook(int index) {
    Book bookCopy  = new Book(this.listBooks.get(index));
        return  bookCopy ;
    }

    public void setBook(int index ,  Book newBook) {
        this.listBooks.set(index ,new Book(newBook)) ;
    }

    public void addBook(Book newBook){
        this.listBooks.add(new Book(newBook));
    }

    public boolean contains(Book book){
        return this.listBooks.contains(book);
    }
    

  
}
