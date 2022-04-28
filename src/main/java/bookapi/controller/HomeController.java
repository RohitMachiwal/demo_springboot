package bookapi.controller;

import bookapi.model.Book;
import bookapi.servicesImpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private BookServiceImpl bookService;

    @PostMapping("/save")
   public void save(@RequestBody Book book){
       bookService.post(book);
   }

   @GetMapping("/books")
   public List<Book> getAllBooks(){
        return  (List<Book>) bookService.getAllBooks();
   }

   @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id){

        return bookService.getBookById(id);
   }

   @DeleteMapping("/delete/{id}")
      public String deleteBook (@PathVariable (value = "id")Long id){

        bookService.deleteBookById(id);
        return "Deleted Successfully id: "+id;
   }

   @PutMapping("/update/{id}")
    public Book update(@RequestBody Book book,@PathVariable(value = "id")Long id){

        bookService.updateById(book,id);

        return book;
   }


}
