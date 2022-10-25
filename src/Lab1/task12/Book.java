package Lab1.task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {        
        return ((title == null) ? 0 : title.hashCode()) + ((author == null) ? 0 : author.hashCode()) + price + edition;
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\"" + ", author - '" + author + '\'' + ", price - " + Integer.toString(price);
    }
}
