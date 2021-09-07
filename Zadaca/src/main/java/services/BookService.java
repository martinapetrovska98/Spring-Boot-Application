package services;

import models.Book;
import repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list(){
        return bookRepository.findAll();
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getById(long id){
        return bookRepository.getById(id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);

    }

    public Book updateBook(Book book){
        return bookRepository.save(book);


    }
    public void deleteBook(long id){
        bookRepository.deleteById(id);

    }
}
