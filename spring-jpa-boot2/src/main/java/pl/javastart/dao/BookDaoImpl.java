package pl.javastart.dao;

import org.springframework.stereotype.Repository;
import pl.javastart.model.Book;

import javax.persistence.*;
import javax.transaction.Transactional;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Book get(Long id) {
        Book book = entityManager.find(Book.class,id);
        return book;
    }

    @Override
    @Transactional
    public void update(Book book) {
        Book find = entityManager.find(Book.class,book.getId());
        if (find!=null){
            find.setTitle(book.getTitle());
            find.setIsbn(book.getIsbn());
            find.setAuthor(book.getAuthor());
        }
    }

    @Override
    @Transactional
    public void delete(Long bookId) {
        Book objtToRemove = entityManager.find(Book.class,bookId);
        entityManager.remove(objtToRemove);
    }
}
