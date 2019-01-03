package com.webapp.bookrate.Entity;


import javax.persistence.*;

@Entity
public class Rating {

    @GeneratedValue
    @Id
    private long id;

    private byte rate;

    private String review;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn( name = "book_id")
    private Book book;


    public void setRate(byte rate) {
        this.rate = rate;
    }

    public byte getRate() {
        return rate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReview() {
        return review;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rating()
    { }
}
