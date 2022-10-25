package Lab1.task14;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;    

    @Override
    public Object clone() {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        book.isbn = this.isbn;
        return book;
    }

    @Override
    public int compareTo(Book o) {
        Book book = o;
        return this.isbn < book.isbn ? -1 : (this.isbn > book.isbn ? 1 : 0);
    }
}
