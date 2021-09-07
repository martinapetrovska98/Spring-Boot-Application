package rest;

import services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookControllerTest {

    @Mock
    BookService bookService;
    @InjectMocks
    BookController bookController;

    @Test
    void testGetBook() {
        bookController.getBook(1);
        Mockito.verify(bookService).getById(1);
    }

    @Test
    void testSpecificBook(){
        bookController.getBook(3);
                Mockito.verify(bookService).getById(3);
    }
}