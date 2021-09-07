package rest;

import models.Author;
import models.Book;
import services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    Author getAuthor(@PathVariable long id){

        return authorService.getAuthorById(id);
    }


    private Author findAuthorById(long id){
        return authorService.getById(id);
    }

    private Author createAuthor(){
        Author author = new Author();
       return authorService.addAuthor(author); }


}

