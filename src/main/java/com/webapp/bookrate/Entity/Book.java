package com.webapp.bookrate.Entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;

    private String author;

    private short year;

    private String publisher;

    private String genre;

    @OneToMany
    @JoinColumn( name = "book_id")
    private Set<Rating> ratings;


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }

    public long getId() {
        return id;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }
}
