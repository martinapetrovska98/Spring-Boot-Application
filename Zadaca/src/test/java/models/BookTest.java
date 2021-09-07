package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void books(){
        Book b  = new Book();
        Author a = new Author();
        b.setAuthor(a);
//        assertEquals(a, b.getAuthor());
    }

    @Test void testAddBook(){
        Book book = new Book();
        book.setTitle("Book1");
        Assertions.assertEquals(book.getTitle(), "Book1");
    }

}