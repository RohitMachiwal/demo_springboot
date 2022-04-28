package bookapi.repository;

import bookapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

//public interface BookRepository extends JpaRepository<Book, UUID> {
public interface BookRepository extends JpaRepository<Book,Long>{

}
