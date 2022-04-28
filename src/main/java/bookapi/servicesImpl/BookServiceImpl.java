package bookapi.servicesImpl;

import bookapi.model.Book;
import bookapi.repository.BookRepository;
import bookapi.services.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookServiceInterface {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
//
//    @Override
//    public Book getBookById(UUID id) {
//        return bookRepository.findById(id).get();
//    }

    @Override
    public Book getBookById(long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void post(Book book) {
         bookRepository.save(book);
    }

//    @Override
//    public Book updateById(UUID id) {
//        return null;
//    }
//
//    @Override
//    public void deleteBookById(UUID id) {
//      bookRepository.deleteById(id);
//    }

    @Override
    public Book updateById(Book book,long id) {

       book.setBookId(id);

       bookRepository.save(book);
       return book;

    }

    @Override
    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }


}
