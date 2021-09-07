package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Book {

    @Id
    private int id;

    private String title;
    @ManyToOne
    private Author authors;
    private genreStatus genre;

    public Book() {

    }

    public void save(Book book) {
    }

    public void save() {
    }

    public enum genreStatus {
        fiction,
        nonfiction;
    }


    public Book(String title, String author, genreStatus genre, int id) {
        this.title = title;
        this.id = id;
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Id
    public int getId() {
        return id;
    }


    public genreStatus getGenre() {
        return genre;
    }

    public void setGenre(genreStatus genre) {
        this.genre = genre;
    }

    public void setAuthor(Author author) {
        this.authors = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
