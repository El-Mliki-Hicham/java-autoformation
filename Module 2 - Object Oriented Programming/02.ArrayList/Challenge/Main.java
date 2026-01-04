
public class Main {
    public static void main(String[] args) {
    Book book = new Book("Book 1", "no one", 3, 300);
    
    Book copy1 = new Book(book);
    copy1.setPrice(340);
    Book copy2 = new Book(book);
    Book copy3 = new Book(book);
    copy3.setAuthor("amine");
    
    Store newStoreBook = new Store();
    newStoreBook.addBook(book);
    newStoreBook.addBook(copy1);
    newStoreBook.addBook(copy2);
    book.setAuthor("hicham");
    newStoreBook.addBook(book);
    
     Boolean checkBook = newStoreBook.contains(copy3);
        System.out.println(checkBook);
    // System.out.println(newStoreBook.getBook(2));
    }
}
