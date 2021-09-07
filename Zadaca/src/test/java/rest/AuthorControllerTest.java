package rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import services.AuthorService;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class AuthorControllerTest {

    @Mock
    AuthorService authorService;

    @InjectMocks
    AuthorController authorController;


    @Test void testGetAuthor(){
        authorController.getAuthor(7);
        Mockito.verify(authorService).getById(7);
    }


}