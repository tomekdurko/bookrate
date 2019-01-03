package com.webapp.bookrate.Entity;


import javax.persistence.*;

@Entity
public class Rating {

    @GeneratedValue
    @Id
    private long id;

    private byte rate;

    private String review;


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

    public Rating(byte rate, String review)
    {
        this.rate = rate;
        this.review =review;
    }
}
