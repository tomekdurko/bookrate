package com.webapp.bookrate.Entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Email
    private String email;

    private String password;


    @OneToMany
    @JoinColumn( name = "user_id")
    private Set<Rating> ratings;

    public void setId(long id) {
        this.id = id;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public User(String name, String password, String email)
    {
        this.name = name;
        this.email = email;
        this.password= password;
    }
}
