package com.webapp.bookrate.Controller;


import com.webapp.bookrate.Entity.Book;
import com.webapp.bookrate.Entity.Rating;
import com.webapp.bookrate.Services.BookServices;
import com.webapp.bookrate.Services.RatingServices;
import com.webapp.bookrate.Services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private RatingServices ratingServices;
    private BookServices bookServices;
    private UserServices userServices;

    public RatingController(RatingServices ratingServices, BookServices bookServices,UserServices userServices)
    {
        this.ratingServices =ratingServices;
        this.bookServices = bookServices;
        this.userServices = userServices;
    }

    @GetMapping
    public List<Rating> getRatings()
    {
        return ratingServices.getRatings();
    }

    @GetMapping("/book/{bookId}")
    public List<Rating> getRatingsByBook(@PathVariable long bookId)
    {
        return ratingServices.getRatingByBook( bookServices.getBook(bookId).get());
    }

    @GetMapping("/user/{userId}")
    public List<Rating> getRatingsByUser(@PathVariable long userId)
    {
        return ratingServices.getRatingByUser( userServices.getUser(userId).get());
    }

    @GetMapping("/{ratingId}")
    public Optional<Rating> getRating(@PathVariable long ratingId)
    {
        return ratingServices.getRating(ratingId);
    }

    @PostMapping("user/{userId}/book/{bookId}")
    public Rating addRating(@PathVariable long userId, @PathVariable long bookId, @RequestBody Rating rating)
    {
        rating.setBook(bookServices.getBook(bookId).get());
        rating.setUser(userServices.getUser(userId).get());
        return ratingServices.addRating(rating);
    }

}
