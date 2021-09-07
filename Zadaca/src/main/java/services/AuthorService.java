package services;

import models.Author;
import org.springframework.stereotype.Component;
import repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Component
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorById(long id) {
        return authorRepository.getById(id);
    }

    public List<Author> list(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author) {
        return  authorRepository.save(author);


    }
   /* public String getAuthor(String Object idA;
        idA);{
        String idA = new String();

        return AuthorRepository.findOne(idA);
    }*/
   /*private List<Author> findAll() {

    }*/
   public List<Author> getAllAuthors() {
       List<Author> authors = new ArrayList<>();
       authors.addAll(authorRepository.findAll());
       return authors;
            }

    public Author getById(long id) {
       return authorRepository.getById(id);
    }
}
