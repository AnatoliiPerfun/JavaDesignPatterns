package Patterns.AdditionalPatterns.NullObject.DAO;

import java.util.List;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:31 PM
 */
public interface BookDAO {
    List<Books> getAllBooks();
    Books getBookById(int number);
    void saveBook(Books book);
    void deleteBook(Books book);
}
