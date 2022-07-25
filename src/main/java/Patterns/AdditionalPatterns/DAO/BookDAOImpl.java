package Patterns.AdditionalPatterns.DAO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:32 PM
 */
public class BookDAOImpl implements BookDAO{

    protected List<Books> books = new ArrayList<>();
    public BookDAOImpl() {
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "GOLANG"));
        books.add(new Books(3, "Dart"));
    }

    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookById(int number) {
        return books.get(number);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Books book) {
        books.remove(book);
    }
}
