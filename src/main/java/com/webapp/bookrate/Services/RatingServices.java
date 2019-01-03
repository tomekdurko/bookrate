package com.webapp.bookrate.Services;

import com.webapp.bookrate.Entity.Book;
import com.webapp.bookrate.Entity.Rating;
import com.webapp.bookrate.Entity.User;
import com.webapp.bookrate.Repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServices {

    RatingRepository ratingRepository;

    public RatingServices(RatingRepository ratingRepository)
    {
        this.ratingRepository = ratingRepository;
    }

    public Optional<Rating> getRating(long id)
    {
        return ratingRepository.findById(id);
    }

    public List<Rating> getRatings()
    {
        return ratingRepository.findAll();
    }

    public List<Rating> getRatingByBook(Book book)
    {
        return ratingRepository.findByBook(book);
    }

    public List<Rating> getRatingByUser(User user)
    {
        return ratingRepository.findByUser(user);
    }

    public Rating addRating(Rating rating)
    {
        return ratingRepository.save(rating);
    }
}
