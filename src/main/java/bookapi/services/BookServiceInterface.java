package bookapi.services;

import bookapi.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookServiceInterface {

     public List<Book> getAllBooks();

//     public  Book getBookById(UUID id);
public  Book getBookById(long id);
     public void post(Book book);

//     public Book updateById(UUID id);
//
//     public void deleteBookById(UUID id);


     public Book updateById(Book book,long id);

     public void deleteBookById(long id);

}
