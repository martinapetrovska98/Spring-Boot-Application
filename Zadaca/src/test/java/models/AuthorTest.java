package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthorTest {

    @Test void testObjectCreation(){
        Author author = new Author();
        author.setFirstName("narty");
        Assertions.assertEquals(author.getFirstName(), "narty");
    }

    @Test void testSpecific(){
        Author author = new Author();
        author.setId(3);
        Assertions.assertEquals(author.getById(),"3");
    }


}