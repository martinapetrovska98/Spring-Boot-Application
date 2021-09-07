package rest;

import models.Book;
import services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id){
        return findBookById(id);
    }


    private Book findBookById(long id){
        return bookService.getById(id);
    }

    private Book updateBook(long id){
        Book book = new Book();
        book.save();
        return  bookService.updateBook(book);
    }

    private Book createBook(Book book){
        return bookService.addBook(book);
    }
}
