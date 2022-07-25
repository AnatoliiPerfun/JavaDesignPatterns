package Patterns.AdditionalPatterns.DAO;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:34 PM
 */
public class AccessBook {
    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAOImpl();

        bookDAO.getAllBooks()
                .stream()
                .map(book -> "Book ID : " + book.getNumber() + " Advanced " + book.getName())
                .forEach(System.out::println);
        Books book = bookDAO.getAllBooks().get(1);
        bookDAO.saveBook(book);
    }
}
