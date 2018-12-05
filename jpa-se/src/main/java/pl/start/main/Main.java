package pl.start.main;

import pl.start.dao.BookDao;
import pl.start.dao.BookDaoImpl;
import pl.start.model.Book;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("123456789", "Wilk z Wall Street","Jordan Belfort");
//        BookDao bookDao = new BookDaoImpl();
//        bookDao.save(book);
//        System.out.println("Book saved");
//        bookDao.cleanUp();

        BookDao bookDao = new BookDaoImpl();
        Book book = bookDao.get(1L);
        System.out.println(book);
        bookDao.cleanUp();

    }
}
